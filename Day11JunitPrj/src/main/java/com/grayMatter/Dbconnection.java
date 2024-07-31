package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dbconnection {

	private String url;
	private String username;
	private String password;
	
	public Connection getConnection(String url,String username,String password) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		return con;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Dbconnection db = (Dbconnection)obj;
		return this.url.equals(db.getUrl()) && this.username.equals(db.getUsername())&& this.password.equals(db.getPassword()) ;
	}
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return Objects.hash(url,username,password);
//	}
	
}
