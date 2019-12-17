package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DeleteQueryWithProperties {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		try {
			//			Driver driver = new Driver(); Old method
			//			DriverManager.registerDriver(driver);

			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driver-class-name"));

			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);

			String sql = prop.getProperty("delete-query");
			pstmt = conn.prepareStatement(sql);


		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!= null) {
					conn.close();
				}if(pstmt!= null) {
					pstmt.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
