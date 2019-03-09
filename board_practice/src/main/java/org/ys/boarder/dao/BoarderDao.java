package org.ys.boarder.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.ys.boarder.domain.BoarderVO;

@Repository
public class BoarderDao implements IBoarderDao {

	@Autowired
	SqlSession session;

	@Override
	public void insertDao(BoarderVO boarderVo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("¿Œº≠∆Æ=======================================================================================" + boarderVo.toString());
		session.insert("boarder.create", boarderVo);
	}

	@Override
	public List<BoarderVO> selectBoarderAllDao(BoarderVO boarder) throws Exception {
		// TODO Auto-generated method stub

		return session.selectList("boarder.showList", boarder);
	}

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return session.selectOne("boarder.showTime");
	}

}
