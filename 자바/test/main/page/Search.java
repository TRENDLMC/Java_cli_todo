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
	
	Connection conn;
	
	java.sql.Statement stmt;

	ResultSet rs;
	
	
	
	public void sec() {
		
		
		try{
			 
			Search search= new Search();

			Class.forName(driver);
			
			conn=DriverManager.getConnection(url,user,pwd);

			stmt=conn.createStatement();
			
			System.out.println("조회할 계좌번호를 입력해주세요");
			System.out.print("계좌번호:");
			String num=sca.next();
			String numO=search.cunumsearch(num);
			rs=stmt.executeQuery(numO);
			 if(!num.equals(numO)) {
				 System.out.println("계좌번호가 일치하지않습니다");
				 System.out.println("메인메뉴로 돌아갑니다");
				Mainpage main=new Mainpage();
					
				main.Page();
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
					 System.out.println("메인메뉴로 돌아갑니다");
					Mainpage main=new Mainpage();
					 main.Page();
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
	
		
		try{

		Class.forName(driver);
		
		conn=DriverManager.getConnection(url,user,pwd);

		stmt=conn.createStatement();
		
		String money="select accnum,cuname,money from accnum where accnum="+renum;
		
		rs=stmt.executeQuery(money);
		
		while(rs.next()) {
			System.out.println("계좌번호:"+rs.getString("accnum"));
			System.out.println("잔액:"+rs.getLong("money"));
			System.out.println("계좌주:"+rs.getString("cuname"));
		}
		rs.close();

		stmt.close();

		conn.close();
		
		System.out.println("정상적으로 잔액조회가끝낫습니다");
		System.out.println("종료하시려면 1번 메인메뉴는 2번을 눌러주세요");
		System.out.print("번호:");int end=sca.nextInt();
		if(end==2) {
			Mainpage main=new Mainpage();
			main.Page();	
		}else {
			return;
		}
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	public String cunumsearch(String renum) {
	
		String reulst=null;
		
		try{

		Class.forName(driver);
		
		conn=DriverManager.getConnection(url,user,pwd);

		stmt=conn.createStatement();
		
		String meney="select accnum from accnum where accnum="+renum;
		
		rs=stmt.executeQuery(meney);
		
		while(rs.next()) {
		reulst =rs.getString("accnum");
		}
		
		rs.close();

		stmt.close();

		conn.close();

		
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return reulst;
	}
	
	public int sepass(String renum) {
		int repass=0;
		
		try{

		Class.forName(driver);
		
		conn=DriverManager.getConnection(url,user,pwd);

		stmt=conn.createStatement();
		
		String meney="select pass from accnum where accnum="+renum;
		
		rs=stmt.executeQuery(meney);
		
		while(rs.next()) {
		repass =rs.getInt("pass");
		}
		
		rs.close();

		stmt.close();

		conn.close();

		
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return repass;
	}
	
	public long dbmoney(String renum) {
		
		long dbmoney=0;
		
		try{

		Class.forName(driver);
		
		conn=DriverManager.getConnection(url,user,pwd);

		stmt=conn.createStatement();
		
		String money="select money from accnum where accnum="+renum;
		
		rs=stmt.executeQuery(money);
		
		while(rs.next()) {
		dbmoney =rs.getLong("money");
		}
		
		rs.close();

		stmt.close();

		conn.close();

		
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return dbmoney;
	}
	
	
	
		public void updb(String renum,long money) {
		
		try{

		Class.forName(driver);
		
		conn=DriverManager.getConnection(url,user,pwd);

		stmt=conn.createStatement();
		
		String updb="UPDATE accnum SET money='"+money+"'WHERE accnum='"+renum+"'";
		
		stmt.executeUpdate(updb);

		rs.close();

		stmt.close();

		conn.close();

		
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	
	
	
}
