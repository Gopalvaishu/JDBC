package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertthedataintoTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jehe8","root","root");
		Statement statement=connection.createStatement();
		statement.execute("insert into student values(1,'vaishu',8550875234)");
		statement.execute("insert into student values(2,'vishnu',8500875234)");
		statement.execute("insert into student values(3,'radha',8850875234)");
		System.out.println("The values are inserted into the table");
		
		
		
		
		
		
	}
}
