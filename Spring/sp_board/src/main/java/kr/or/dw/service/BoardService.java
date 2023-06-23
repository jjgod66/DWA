package kr.or.dw.service;

import java.sql.SQLException;
import java.util.Map;

import kr.or.dw.command.SearchCriteria;

public interface BoardService {

	// 해당하는 게시글목록 조회
	Map<String, Object> selectBoardList(SearchCriteria cri) throws SQLException;
}
