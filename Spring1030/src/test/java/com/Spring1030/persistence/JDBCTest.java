package com.Spring1030.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;
import lombok.extern.log4j.Log4j;
import static org.junit.Assert.fail;

@Log4j
public class JDBCTest {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try (Connection conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:XE", "green", "1234")
			){
			log.info(conn);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
