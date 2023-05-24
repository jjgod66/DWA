package kr.or.dw.board.service;

import java.util.List;
import java.util.Map;

import kr.or.dw.board.vo.BoardVO;

public interface IBoardService {

	List<BoardVO> selectBoardList(Map<String, Object> paramMap);
	
	int selectBoardCount();

	int insertContent(BoardVO boardVo);
}
