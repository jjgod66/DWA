package kr.or.dw.board.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.dw.board.service.BoardServiceImpl;
import kr.or.dw.board.service.IBoardService;
import kr.or.dw.board.vo.BoardVO;
import kr.or.dw.user.vo.UserVO;
import kr.or.dw.web.IAction;

public class ContentInsertAction implements IAction {

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		UserVO userVo = (UserVO) session.getAttribute("userVO");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		BoardVO boardVo = new BoardVO();
		boardVo.setBd_title(title);
		boardVo.setBd_content(content);
		boardVo.setUser_no(userVo.getUser_no());
		boardVo.setNick(userVo.getNick());
		
		IBoardService service = BoardServiceImpl.getInstance();
		int bd_no = 0;
		bd_no = service.insertContent(boardVo);
		
		return null;
	}

}
