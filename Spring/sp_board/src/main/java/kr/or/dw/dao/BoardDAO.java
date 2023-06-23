package kr.or.dw.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import kr.or.dw.command.SearchCriteria;
import kr.or.dw.vo.BoardVO;

@Mapper
public interface BoardDAO {

	// 해당하는 게시글목록 조회
	List<BoardVO> selectSearchBoardList(SearchCriteria cri, RowBounds rowBounds) throws SQLException;

	// 해당하는 게시글 수 조회
	int selectSearchBoardListCount(SearchCriteria cri);
	
}
