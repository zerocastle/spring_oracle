package org.ys.boarder;
import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class OracleDBTest1 {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@//localhost:1521/orcl";
	private static final String USER = "kys";
	private static final String PW = "kys";

	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);

		try (Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("**con**  " + con);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
