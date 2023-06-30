package kr.or.dw.service;

import java.sql.SQLException;
import java.util.Map;

import kr.or.dw.command.SearchCriteria;
import kr.or.dw.vo.PdsVO;

public interface PdsService {

	// 자료실 게시물 등록
	void regist(PdsVO pds) throws SQLException;

	// 자료실 게시물 리스트 조회
	Map<String, Object> selectPdsList(SearchCriteria cri) throws SQLException;

	// 해당 자료실 게시글 조회
	PdsVO selectPds(int pno, String from) throws SQLException;

	// 자료실 게시물 수정
	void modify(PdsVO pds) throws SQLException;

	// 해당 자료실 게시물 삭제
	void remove(int pno) throws SQLException;
}
