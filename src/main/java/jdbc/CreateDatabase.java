package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");//connection is return type
		Statement statement=connection.createStatement();//return type is statement
		statement.execute("create database JEHE8");//return type is boolean bez it checks query is correct or not and it present in stmt
		System.out.println("Database is created");
		
		
		
	}

}