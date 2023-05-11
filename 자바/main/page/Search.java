package main.page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Search {
	 Scanner sca=new Scanner(System.in);
	 String renum;
	public void sec() {
		End end=new End();
		Sqltset sql=new Sqltset();
		
			System.out.println("조회할 계좌번호를 입력해주세요");
			System.out.print("계좌번호:");
			String num=sca.next();
			String numO=sql.seNum(num);
			 if(!num.equals(numO)) {
				 System.out.println("계좌번호가 일치하지않습니다");
				 end.endporss(10);
			 }
			System.out.println("조회할 계좌 비밀번호를 입력해주세요");
			System.out.print("비밀번호:");
			int pass=sca.nextInt();
			int passO=sql.sepass(num);
			 if(pass!=passO) {
				 System.out.println("비밀번호가 일치하지않습니다");
				 end.endporss(10);
			 }
			sql.seAcc(num);
			end.endporss(5);
	}
	
}
