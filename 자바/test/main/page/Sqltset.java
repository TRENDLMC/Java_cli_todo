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
	
	public static void main(String[] args) {
		
	Connection conn;

	Statement stmt;

	ResultSet rs;

	try{

		Class.forName(driver);

		System.out.println("oracle드라이버연결성공");// 프린트문을넣어서 어디서오류가났는지 확인할때 좋다 

		conn=DriverManager.getConnection(url,user,pwd);

		System.out.println("connection 생성성공");

		stmt=conn.createStatement();
		System.out.println("객체 생성성공 ");

		String query="insert into member values('0003','차범근',185,85,23)";

		stmt.executeUpdate(query);

		String query2="select * from member";

		rs=stmt.executeQuery(query2);

				while (rs.next()){

					System.out.println("아이디는"+rs.getString("id"));
					
					System.out.println("이름은"+rs.getString("name"));

					System.out.println("키는"+rs.getInt("height"));

					System.out.println("체중은"+rs.getInt("weight"));

					System.out.println("나이는"+rs.getInt("age"));

				}

	rs.close();

	stmt.close();

	conn.close();

	}catch(Exception e){

	e.printStackTrace();

	}
		
	}

}
