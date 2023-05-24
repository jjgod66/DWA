package kr.or.dw.board.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.dw.board.vo.BoardVO;
import kr.or.dw.util.BuildSqlMapClient;

public class BoardDaoImpl implements IBoardDao {

	private static BoardDaoImpl dao;
	private SqlMapClient client;
	
	private BoardDaoImpl() {
		client = BuildSqlMapClient.getSqlMapClient();
	}
	
	public static BoardDaoImpl getInstance() {
		if (dao == null) dao = new BoardDaoImpl();
		return dao;
	}

	@Override
	public List<BoardVO> selectBoardList(Map<String, Object> paramMap) {
		List<BoardVO> boardList = null;
		
		try {
			boardList = client.queryForList("board.selectBoardList", paramMap);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return boardList;
	}

	@Override
	public int selectBoardCount() {
		int count = 0;
		try {
			count = (int) client.queryForObject("board.selectBoardCount");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int insertContent(BoardVO boardVo) {
		int bd_no = 0;
		try {
			bd_no = (int) client.queryForObject("board.insertContent", boardVo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bd_no;
	}
	
}	
