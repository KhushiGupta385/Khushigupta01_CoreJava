package com.sait.db.ps;

import java.sql.*;
public class ReadData {
	
	public static void main (String[] args) {
		try {
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/sait","root","Khushi");
			PreparedStatement ps=c.prepareStatement("Select * from students where sname=?");
			ps.setString(1,"khushi");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("sid"));
				System.out.println(rs.getString("sname"));
				System.out.println(rs.getString("sphone"));
				System.out.println("---------");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}