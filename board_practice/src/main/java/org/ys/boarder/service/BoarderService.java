package org.ys.boarder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ys.boarder.dao.IBoarderDao;
import org.ys.boarder.domain.BoarderVO;

@Service
public class BoarderService implements IBoarderService {

	@Autowired
	private IBoarderDao dao;

	@Override
	public void insertService(BoarderVO boarderVo) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("¿Œº≠∆Æ=======================================================================================");
		dao.insertDao(boarderVo);
		
	}

	@Override
	public List<BoarderVO> selectBoarderAllService(BoarderVO boarder) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectBoarderAllDao(boarder);
	}

}
