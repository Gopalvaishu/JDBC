package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Aadharcard {
	public static void main (String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement statement=connection.createStatement();
		statement.execute("create database aadharcardddd12345 ");
		connection.close();
		
		Connection connection1=DriverManager.getConnection("jdbc:mysql://localhost:3306/aadharcardddd12345","root","root");
		Statement statement1=connection1.createStatement();
		statement1.execute("create table vishnu(aa_id bigint primary key,name varchar(25) not null ,address varchar(30) not null)");
		statement1.execute("insert into vishnu values(789056788900,'vaishu','vinayakanagara')");
	    statement1.execute("update vishnu set name='yashv' where aa_id=789056788900");
	    ResultSet resultset=statement1.executeQuery("select * from vishnu");
	    resultset.next();
	    System.out.println("id:"+resultset.getLong(1)+" "+"name:"+resultset.getString(2)+" "+"address:"+resultset.getString(3));
	    statement1.execute("delete from vishnu");
	    statement1.execute("drop table vishnu");
	}
}
	    

		
		
		
	


