package kr.or.dw.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import kr.or.dw.vo.PdsVO;

@Mapper
public interface PdsDAO {
	
	// 자료실 게시물 등록
	int insertPds(PdsVO pds) throws SQLException;

	

}
