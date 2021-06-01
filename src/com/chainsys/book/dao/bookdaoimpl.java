package com.chainsys.book.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Set;

import com.chainsys.book.model.book;

public class bookdaoimpl implements bookdao {

	
	private static Connection con;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
//	private static Set<book> bookSet;

	public bookdaoimpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "root", "password");
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.20:1521:EBS1228", "apps", "apps");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public  book findbyname(String name) {
		// TODO Auto-generated method stub
		book book = null;
		try {
			pstmt = con.prepareStatement("select * from book_2598 where name=?");
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				book = new book(rs.getInt("id"), rs.getString("name"), rs.getDate("publishedDate").toLocalDate());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}
}
