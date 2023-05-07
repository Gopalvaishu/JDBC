package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabaseinthemysqlapplication {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement statement=connection.createStatement();//createStmt is abstract method
		statement.execute("create Database JEHE9");//for abstract method we can pass arg?- ans is pass an arg means it is local var so finally we can pass the arg ,
		//even though it(execute) is absract method we can pass arg
		System.out.println("Database is created");
	}

}
