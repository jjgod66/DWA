package kr.or.dw.board.dao;

import java.util.List;
import java.util.Map;

import kr.or.dw.board.vo.BoardVO;

public interface IBoardDao {
	List<BoardVO> selectBoardList(Map<String, Object> paramMap);

	int selectBoardCount();

	int insertContent(BoardVO boardVo);
}
