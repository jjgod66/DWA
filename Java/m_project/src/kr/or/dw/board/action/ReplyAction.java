package kr.or.dw.board.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.dw.board.service.BoardServiceImpl;
import kr.or.dw.board.service.IBoardService;
import kr.or.dw.board.vo.ReplyVO;
import kr.or.dw.user.vo.UserVO;
import kr.or.dw.web.IAction;

public class ReplyAction implements IAction {

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		IBoardService service = BoardServiceImpl.getInstance();
		
		HttpSession session = req.getSession();
		UserVO userVo = (UserVO) session.getAttribute("userVO");
		
		int user_no = userVo.getUser_no();
		String nick = userVo.getNick();
		int bd_no = Integer.parseInt(req.getParameter("bd_no"));
		String re_content = req.getParameter("re_content");
		
		ReplyVO replyVo = new ReplyVO();
		replyVo.setBd_no(bd_no);
		replyVo.setUser_no(user_no);
		replyVo.setNick(nick);
		replyVo.setRe_content(re_content);

		int re_no = service.insertReply(replyVo);
		ReplyVO resultReplyVo = service.selectReply(re_no);
		
		req.setAttribute("replyVo", resultReplyVo);
		
		return "/board/reply_ajax.jsp";
	}

}
