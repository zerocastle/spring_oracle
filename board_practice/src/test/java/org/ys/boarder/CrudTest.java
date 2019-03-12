package org.ys.boarder;

import java.sql.Timestamp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.ys.boarder.dao.IBoarderDao;
import org.ys.boarder.domain.BoarderVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/root-context.xml" })
public class CrudTest {

	@Autowired
	IBoarderDao dao;

	private static org.slf4j.Logger logger = LoggerFactory.getLogger(CrudTest.class);

	@Test
	public void insertTest() throws Exception {
		logger.info("test");
		BoarderVO boarder = new BoarderVO();

		boarder.setContent("context");
		boarder.setTitle("title");
		boarder.setWriter("writer");
		boarder.setViewcnt(0);
		boarder.setRegdate(new Timestamp(System.currentTimeMillis()));
		dao.insertDao(boarder);

	}

	@Test
	public void testGetTime() throws Exception {
		logger.info("get Time...");
		System.out.println(dao.getTime());
	}

}
