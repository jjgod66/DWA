package kr.or.dw.service;

import java.sql.SQLException;

import kr.or.dw.vo.PdsVO;

public interface PdsService {

	// 자료실 게시물 등록
	void regist(PdsVO pds) throws SQLException;
}
