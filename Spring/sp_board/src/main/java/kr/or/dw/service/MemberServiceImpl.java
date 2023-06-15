package kr.or.dw.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.dw.dao.MemberDAO;
import kr.or.dw.vo.MemberVO;
import kr.or.dw.vo.MenuVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public void login(String id, String pwd, HttpSession session) throws SQLException {
		MemberVO member = memberDAO.selectMemberById(id);
		
		if (pwd.equals(member.getPwd())) {
			System.out.println("[로그인 성공!!!] 회원의 정보를 세션에 저장합니다.");
			session.setAttribute("loginUser", member);
			session.setMaxInactiveInterval(5 * 60);
		}
		
	}

	@Override
	public List<MemberVO> selectAllMemberList() throws SQLException {
		List<MemberVO> memberList = memberDAO.selectAllMemberList();
		return memberList;
	}

}
