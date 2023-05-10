package main.page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Search {


	private static final String driver="oracle.jdbc.driver.OracleDriver";

	private static final String url="jdbc:oracle:thin:@localhost:1521:XE";

	private static final String user="hr";

	private static final String pwd="12345";
	
	
	
	public void numsearch() {
		
		Connection conn;
			
		java.sql.Statement stmt;

		ResultSet rs;
		
		try{

		Class.forName(driver);
		
		conn=DriverManager.getConnection(url,user,pwd);

		stmt=conn.createStatement();
		
		String meney="select * from view_meney";
		
		rs=stmt.executeQuery(meney);
		
		while(rs.next()) {
			System.out.println("잔액:"+rs.getLong("meney"));
		}
		rs.close();

		stmt.close();

		conn.close();

		
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public void numsearch(int x) {
		
	Connection conn;
		
	java.sql.Statement stmt;

	ResultSet rs;
	
	try{

	Class.forName(driver);
	
	System.out.println("oracle드라이버연결성공");
	 
	conn=DriverManager.getConnection(url,user,pwd);

	System.out.println("connection 생성성공");

	stmt=conn.createStatement();
	
	String num="select * from view_num_meney_name where ";

	rs=stmt.executeQuery(num);
	
	while (rs.next()){
		System.out.println("계좌번호:"+rs.getLong("accountnumber"));
		System.out.println("잔액:"+rs.getLong("meney"));
		System.out.println("이름:"+rs.getString("customername"));
	}
	rs.close();

	stmt.close();

	conn.close();

	
	}
	catch (Exception e) {
		e.printStackTrace();
		
		}
	}
}
