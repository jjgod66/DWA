package kr.or.dw.board.dao;

import java.util.List;
import java.util.Map;

import kr.or.dw.board.vo.BoardVO;
import kr.or.dw.board.vo.ReplyVO;

public interface IBoardDao {
	List<BoardVO> selectBoardList(Map<String, Object> paramMap);

	int selectBoardCount();

	int insertContent(BoardVO boardVo);

	BoardVO selectBoardView(int bd_no);

	int updateContent(BoardVO boardVo);

	void deleteContent(int bd_no);

	void increaseBoardHit(int bd_no);

	int insertReply(ReplyVO replyVo);

	ReplyVO selectReply(int re_no);

	Object selectReplyList(int bd_no);
}
