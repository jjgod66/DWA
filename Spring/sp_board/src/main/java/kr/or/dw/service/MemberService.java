package kr.or.dw.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import kr.or.dw.vo.MemberVO;

public interface MemberService {

	// 로그인
	void login(String id, String pwd, HttpSession session) throws SQLException;

	// 회원목록 조회
	List<MemberVO> selectAllMemberList() throws SQLException;

	// 회원 id조회
	MemberVO selectMemberById(String id) throws SQLException;

	// 회원 등록
	void regist(MemberVO member) throws SQLException;

	//회원 정보 수정
	void modify(MemberVO member) throws SQLException;
	
	// 회원 삭제
	void remove(String id) throws SQLException;

	// 회원 정지
	void disabled(String id) throws SQLException;

	
}
