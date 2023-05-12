package main.page;

import java.util.Scanner;

public class seNumber {
	Scanner sca=new Scanner(System.in);
	Sqltset sql=new Sqltset();
	End end=new End();
	
	Search search=new Search();
	Create create=new Create();
	
	
	String seNumber(int number) {
		Transfer tra=new Transfer();
		deposit_and_withdrawal and= new deposit_and_withdrawal();
		String munu=null;
		String num=null;
		int munu1=number;
		switch (munu1) {
		case 1:munu="조회할" ;break;
		case 2:munu="보낼" ;break;
		case 3:munu="받을" ;break;
		case 4:munu="출금할";break;
		case 5:munu="입금할";break;
		}
		System.out.println(munu+"계좌번호를 입력해주세요");
		System.out.print("계좌번호:");
		num=sca.next();
		String numO=sql.seNum(num);
		 if(!num.equals(numO)) {
			 System.out.println("계좌번호가 일치하지않습니다");
			 System.out.println("재입력바랍니다.");
			 switch (munu1) {
			 case 1:search.sec();break;
			 case 2:tra.moneyTransfor();break;
			 case 3:tra.moneyTransfor();break;
			 case 4:and.meney(1);break;
			 case 5:and.meney(2);break;
				}
				
		 }
			 return num;
	}
	
	void sePass(String num) {
		
		System.out.println("조회할 계좌 비밀번호를 입력해주세요");
		System.out.print("비밀번호:");
		int pass=sca.nextInt();
		int passO=sql.sepass(num);
		 if(pass!=passO) {
			 System.out.println("비밀번호가 일치하지않습니다");
			 end.endporss(10);
		 }
	}

}
