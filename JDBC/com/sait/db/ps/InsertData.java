package com.sait.db.ps;

import java.sql.*;
public class InsertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sait","root","Khushi");
			PreparedStatement ps=c.prepareStatement("insert into students (sname,sphone) value(?,?)");
			ps.setString(1,"Khushi");
			ps.setString(2,"1235456945");
			ps.executeUpdate();
			System.out.println("Data inserted Successfully!!!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
