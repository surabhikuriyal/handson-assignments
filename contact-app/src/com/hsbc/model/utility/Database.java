package com.hsbc.model.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.derby.jdbc.ClientDriver;

public class Database {
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName(ClientDriver.class.getName());
		Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527//mydb","surabhi","surabhi123");
		return con;
	}
}
