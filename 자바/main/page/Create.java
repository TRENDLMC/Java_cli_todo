package main.page;import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Create {
	Scanner sca=new Scanner(System.in);
	int re;
	private int a;
	private int b;
	private int c;
	
	private static final String driver="oracle.jdbc.driver.OracleDriver";

	private static final String url="jdbc:oracle:thin:@localhost:1521:XE";

	private static final String user="hr";

	private static final String pwd="12345";
	
	
	void NoCreate() {
		
	
		Connection conn;

		Statement stmt;

		ResultSet rs;

		try{

		Class.forName(driver);
		conn=DriverManager.getConnection(url,user,pwd);
		stmt=conn.createStatement();

		System.out.println("계좌를 생성합니다.");
		System.out.println("-------------------");
		System.out.print("|이름:"); String name=sca.next();
		do {
		System.out.print("|비밀번호:"); int pass=sca.nextInt();
		System.out.print("|비밀번호확인");int passto=sca.nextInt();
			if(pass!=passto) {
			System.out.println("비밀번호가 다릅니다재입력바랍니다");
			re=1;
			}else {
			re=0;
			}
		}while(re==1);
		
		System.out.print("|초기입금액:"); int meney=sca.nextInt();
		System.out.print("-------------------");
		
		a=(int)(Math.random()*1000)+1;
		b=(int)(Math.random()*1000)+1;
		c=(int)(Math.random()*1000)+1;
		
		//계좌생성 
		String numcre="INSERT into accnum VALUES('name',numadd.nextval,'a-b-c',pass,meney);";
		stmt.executeUpdate(numcre);
		Search search=new Search();
		search.numsearch(1);
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	

}
