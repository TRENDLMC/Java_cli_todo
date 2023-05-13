package main.page;

import java.util.Scanner;

public class D_A_W {
	End end=  new End();
	Scanner sca=new Scanner(System.in);
	Sqltest sql=new Sqltest();
	Senumber sec=new Senumber();
	
	public void meney(int x) {
		int y= x;
		if(y==1) {
		String realunm=sec.seNumber(4);
		sec.sePass(realunm);
		System.out.print("출금하실금액을 입력해주십시오:");
		long money=sca.nextInt();
		if(money<0) {
			 System.out.println("금액이 이상합니다 ");
			 end.endporss(8);
		 } 
		
		long russmoney=sql.seMon(realunm);
		 
		 if(russmoney<money) {
			 System.out.println("잔액이 모자릅니다");
			 end.endporss(8);
		 }else {
				long ehs= russmoney-money;
				 sql.updb(realunm, ehs);
		 }
		 long outmoney=sql.seMon(realunm);
		 System.out.println("+-------------------+");
		 System.out.println("|현재잔액:"+outmoney+"|");
		 System.out.println("+-------------------+");
		end.endporss(2); 
		}
		else if(y==2){
			String realunm=sec.seNumber(5);
			System.out.println("입급하실금액을 입력해주십시오");
			System.out.print("입금액:");
			 long money=sca.nextInt();
			 if(money<0) {
				 System.out.println("금액이 이상합니다 ");
				 end.endporss(9);
				}
			long dbmoney=sql.seMon(realunm);
			 money +=dbmoney;
			 sql.updb(realunm, money);
			 long outmoney=sql.seMon(realunm);
			 System.out.println("+-------------------+");
			 System.out.println("|현재잔액:"+outmoney+"|");
			 System.out.println("+-------------------+");
			 end.endporss(3);
			}
	}
	 
}




