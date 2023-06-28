package kr.or.dw.controller;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import kr.or.dw.command.PdsRegistCommand;
import kr.or.dw.service.PdsService;
import kr.or.dw.vo.AttachVO;
import kr.or.dw.vo.PdsVO;

@Controller
@RequestMapping("/pds")
public class PdsController {

	@Resource(name= "fileUploadPath")
	private String fileUploadPath;
	
	@Autowired
	private PdsService pdsService;
	
	@RequestMapping("/main")
	public String main() {
		return "pds/main.open";
	}
	
	@RequestMapping("/list")
	public ModelAndView list(ModelAndView mnv) {
		String url = "pds/list.open";
		
		mnv.setViewName(url);
		
		return mnv;
	}
	
	@RequestMapping("/registForm")
	public String registForm() {
		String url = "pds/regist.open";
		
		return url;
	}
	
	@RequestMapping("/regist")
	public void regist(PdsRegistCommand registReq, HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<AttachVO> attachList = saveFile(registReq);
		
		PdsVO pds = registReq.toPdsVO();
		pds.setAttachList(attachList);
		pds.setTitle((String)req.getAttribute("XSStitle"));
		
		pdsService.regist(pds);
		
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<script>alert('정상적으로 등록되었습니다.'); window.opener.location.href='" + req.getContextPath() + "/pds/list';");
		out.println("window.close(); </script>");
		out.close();
	}

	private List<AttachVO> saveFile(PdsRegistCommand registReq) throws Exception {
		String fileUploadPath = this.fileUploadPath;
		
		List<AttachVO> attachList = new ArrayList<AttachVO>();
		
		if (registReq.getUploadFile() != null) {
			for (MultipartFile multi : registReq.getUploadFile()) {
				String fileName = UUID.randomUUID().toString().replace("-", "") + "$$" + multi.getOriginalFilename();
				File target = new File(fileUploadPath, fileName);
				
				if (!target.exists()) {
					target.mkdirs();
				}
				
				multi.transferTo(target);
				
				AttachVO attach = new AttachVO();
				attach.setUploadpath(fileUploadPath);
				attach.setFilename(fileName);
				attach.setFiletype(fileName.substring(fileName.lastIndexOf(".") + 1).toUpperCase());
				
				attachList.add(attach);
			}
		}
		
		return attachList;
	}
}
