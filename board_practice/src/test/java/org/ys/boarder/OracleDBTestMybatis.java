package org.ys.boarder;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"classpath:spring/root-context.xml"})
public class OracleDBTestMybatis {

	@Inject 
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void testFactory() {
		System.out.println("**sqlFactory**:  " + sqlFactory);
	}

	@Test
	public void testSessioin() throws Exception{
		try(SqlSession session = sqlFactory.openSession()){
			System.out.println("**session**: " + session);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("*******************error**********************");
		}
	}

}
