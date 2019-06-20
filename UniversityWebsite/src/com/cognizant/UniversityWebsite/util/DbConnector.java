package com.cognizant.UniversityWebsite.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
public class DbConnector {
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
	ResourceBundle rb = ResourceBundle.getBundle("mysql");
    String driver=rb.getString("db.driver");
	String url = rb.getString("db.url");
	String UserId = rb.getString("db.UserId");
	String Password = rb.getString("db.Password");
	
	Class.forName(driver);
	Connection conn=DriverManager.getConnection(url,UserId,Password);
	return conn;
	}
}
