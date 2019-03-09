package org.ys.boarder.service;

import java.util.List;

import org.ys.boarder.domain.BoarderVO;

public interface IBoarderService {

	public void insertService(BoarderVO boarderVo) throws Exception;

	public List<BoarderVO> selectBoarderAllService(BoarderVO boarder) throws Exception;

}
