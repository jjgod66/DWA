package kr.or.dw.user.dao;

import kr.or.dw.user.vo.UserVO;

public interface IUserDao {
	
	public String getUserNick(String nick);	// 닉네임을 조회하는 메서드
	
	public int insertUser(UserVO vo);	// 회원 정보를 등록하는 메서드
	
	public UserVO loginUser(String email);
}
