package kr.or.dw.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.or.dw.service.MemberService;
import kr.or.dw.service.MenuService;
import kr.or.dw.vo.MenuVO;

@Controller
public class CommonController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

	@Autowired
	private MemberService memberService;
	
	@Autowired
	private MenuService menuService;
	
	@GetMapping("/common/loginForm")
	public String loginForm(HttpServletResponse rest) throws Exception {
		String url = "/common/loginForm";
		
		return url;
	}
	
	@RequestMapping("/common/login")
	public String login(String id, String pwd, HttpSession session) throws SQLException{
		String url = "redirect:/index.do";
		
		memberService.login(id, pwd, session);
		
		return url;
	}
	
	@RequestMapping("/index")
	public ModelAndView index(ModelAndView mnv) throws SQLException{
		String url = "/common/indexPage.page";
		
		List<MenuVO> menuList = menuService.selectMainMenuList();
		
		mnv.addObject("menuList", menuList);
		mnv.setViewName(url);
		
		return mnv;
	}
	
	@RequestMapping("/common/handlebarsTest")
	public String handlebarsTest() {
		String url = "/common/handlebarsTest";
		return url;
	}
	
	@RequestMapping("/common/subMenu")
	public ResponseEntity<List<MenuVO>> subMenu(String mcode) {
		ResponseEntity<List<MenuVO>> entity = null;
		
		List<MenuVO> subMenu = null;
		try {
			subMenu = menuService.selectSubMenuList(mcode);
			entity = new ResponseEntity<List<MenuVO>>(subMenu, HttpStatus.OK);
		} catch (SQLException e) {
			entity = new ResponseEntity<List<MenuVO>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return entity;
	}
}
