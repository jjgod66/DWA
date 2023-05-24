package kr.or.dw.board.service;

import java.util.List;
import java.util.Map;

import kr.or.dw.board.dao.BoardDaoImpl;
import kr.or.dw.board.dao.IBoardDao;
import kr.or.dw.board.vo.BoardVO;

public class BoardServiceImpl implements IBoardService {
	
	private IBoardDao dao;
	private static BoardServiceImpl service;
	
	private BoardServiceImpl() {
		dao = BoardDaoImpl.getInstance();
	}
	
	public static BoardServiceImpl getInstance() {
		if (service == null) service = new BoardServiceImpl();
		return service;
	}

	@Override
	public List<BoardVO> selectBoardList(Map<String, Object> paramMap) {
		return dao.selectBoardList(paramMap);
	}

	@Override
	public int selectBoardCount() {
		return dao.selectBoardCount();
	}

	@Override
	public int insertContent(BoardVO boardVo) {
		return dao.insertContent(boardVo);
	}
	
}
