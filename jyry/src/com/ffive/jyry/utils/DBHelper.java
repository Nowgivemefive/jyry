package com.ffive.jyry.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class DBHelper {
	private static String username = "root";
	private static String password = "admin@155";
	private static String url = "jdbc:MySQL://127.0.0.1:3306/jyry?useSSL=false&serverTimezone=UTC";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConnection() throws  SQLException{
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
	
	public static void free(ResultSet rs, PreparedStatement ps, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if (ps != null) {
				ps.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

