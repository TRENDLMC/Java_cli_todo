package main.page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Search {
	 Scanner sca=new Scanner(System.in);

	 String renum;
	 
	private static final String driver="oracle.jdbc.driver.OracleDriver";

	private static final String url="jdbc:oracle:thin:@localhost:1521:XE";

	private static final String user="hr";

	private static final String pwd="12345";
	
	public void sec() {
		
		Connection conn;
		
		java.sql.Statement stmt;

		ResultSet rs;
		try{

			Class.forName(driver);
			
			conn=DriverManager.getConnection(url,user,pwd);

			stmt=conn.createStatement();
			
			System.out.print("조회할 계좌번호를 입력해주세요");
			String num=sca.next();
			String numO="Select accnum from accnum";
			rs=stmt.executeQuery(numO);
			while(rs.next()) {	
			 if(num.equals(rs.getString("accnum"))) {
				 renum=rs.getString("accnum");
				 break;
			 }else {
				 System.out.println("계좌번호가 일치하지않습니다");
				 return;
			 }
			}
			
			System.out.print("조회할 계좌 비밀번호를 입력해주세요");
			int pass=sca.nextInt();
			String passO="select pass from accnum";
			rs=stmt.executeQuery(passO);
		
			while(rs.next()) {
				int passOx=(int)rs.getInt("pass");
				 if(pass==passOx) {
					 break;
				 }else {
					 System.out.println("비밀번호가 일치하지않습니다");
					 return;
				 }
				}
			
			Search se= new Search();
			
			rs.close();

			stmt.close();

			conn.close();
			
			se.numsearch(renum);

		
		}catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public void numsearch(String renum) {
		
		Connection conn;
			
		java.sql.Statement stmt;

		ResultSet rs;
		
		try{

		Class.forName(driver);
		
		conn=DriverManager.getConnection(url,user,pwd);

		stmt=conn.createStatement();
		
		String meney="select accnum,cuname,meney from accnum where accnum="+renum;
		
		rs=stmt.executeQuery(meney);
		
		while(rs.next()) {
			System.out.println("계좌번호:"+rs.getString("accnum"));
			System.out.println("잔액:"+rs.getLong("meney"));
			System.out.println("계좌주:"+rs.getString("cuname"));
		}
		rs.close();

		stmt.close();

		conn.close();
		return;
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	
}
