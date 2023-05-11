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
	
	public String creNum(String name,int pass,int money) {
		
		String ax=null;
		
		try {
			Class.forName(driver);
		
			conn=DriverManager.getConnection(url,user,pwd);

			stmt=conn.createStatement();
			
			int a=(int)(Math.random()*10000)+1;
			ax=String.valueOf(a);
			
			String query="INSERT into accnum Values('"+name+"',numadd.nextval,'"+ax+"',"+pass+","+money+")"; 
			
			stmt.executeUpdate(query);
			
			rs.close();

			stmt.close();

			conn.close();
			
	}catch (Exception e) {
		e.printStackTrace();
	}
		return ax;

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
		return;
		
	}
	public String seNum(String renum) {
		
		String reulst=null;
		
		try{

		Class.forName(driver);
		
		conn=DriverManager.getConnection(url,user,pwd);

		stmt=conn.createStatement();
		
		String query="select accnum from accnum where accnum="+renum;
		
		rs=stmt.executeQuery(query);
		
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
		
		String query="select pass from accnum where accnum="+renum;
		
		rs=stmt.executeQuery(query);
		
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
	
	public void seAcc(String renum) {
		
		
		try{

		Class.forName(driver);
		
		conn=DriverManager.getConnection(url,user,pwd);

		stmt=conn.createStatement();
		
		String query="select accnum,cuname,money from accnum where accnum="+renum;
		
		rs=stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("계좌번호:"+rs.getString("accnum"));
			System.out.println("잔액:"+rs.getLong("money"));
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
	public long seMon(String renum) {
		
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
	
}
