package main.page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sqltset {
	
	private static final String driver="oracle.jdbc.driver.OracleDriver";

	private static final String url="jdbc:oracle:thin:@localhost:1521:XE";

	private static final String user="hr";

	private static final String pwd="12345";

	Connection conn;

	Statement stmt;

	ResultSet rs;
	
	public static void main(String[] args) {
		
	try {
		Class.forName(driver);
	
		conn=DriverManager.getConnection(url,user,pwd);

		stmt=conn.createStatement();
		

		String query="insert into member values('0003','차범근',185,85,23)";

		stmt.executeUpdate(query);

		String query2="select * from member";

		rs=stmt.executeQuery(query2);

		rs.close();

		stmt.close();

		conn.close();

	}catch(Exception e){

	e.printStackTrace();

	}
		
	}
	
	
	public void creNum(String name,int pass,int money) {
		
	}
		try {
			Class.forName(driver);
		
			conn=DriverManager.getConnection(url,user,pwd);

			stmt=conn.createStatement();
			
			String query=
	}

}
