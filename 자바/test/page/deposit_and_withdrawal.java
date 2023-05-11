package main.page;

import java.util.Scanner;

public class deposit_and_withdrawal {
	End end=  new End();
	Scanner sca=new Scanner(System.in);
	int retry;
	String renum=null;
	Search search=new Search();
	
	public void meney(int x) {
		int y= x;
		if(y==1) {
		do {
		System.out.println("출금하실 계좌를 입력해주세요");
		System.out.print("계좌번호:");
		renum=sca.next();
		String realnum=search.cunumsearch(renum);
		if(!renum.equals(realnum)){
			System.out.println("계좌번호가 틀렸습니다 재입력하시길바랍니다.:");
			retry=1;
		}else {
			retry=0;
		}
		}while(retry==1);
		
		
		System.out.println("계좌의 비밀번호를 입력해주십시오.");
		System.out.print("비밀번호:");
		int repass=sca.nextInt();
		int realpass=search.sepass(renum);
		if(repass!=realpass){
			System.out.println("비밀번호가 틀렸습니다.");
			end.endporss(10);
		}
		System.out.print("출금하실금액을 입력해주십시오:");
		 long money=sca.nextInt();
		 if(money<0) {
			 System.out.println("금액이 이상합니다 ");
			 end.endporss(10);
		 }
	
		 long russmoney=search.dbmoney(renum);
		
		 if(russmoney<money) {
			 System.out.println("잔액이 모자릅니다");
			 end.endporss(10);
		 }else {
				long ehs= russmoney-money;
				 search.updb(renum, ehs);
		 }
		 long outmoney=search.dbmoney(renum);
		 System.out.println("현재잔액:"+outmoney);
		end.endporss(2);
		 
		}
		else if(y==2){
			do {
			System.out.println("입금하실 계좌를 입력해주세요");
			System.out.print("계좌번호:");
			renum=sca.next();
			String realnum=search.cunumsearch(renum);
			if(!renum.equals(realnum)){
				System.out.print("계좌번호가 틀렸습니다 재입력하시길바랍니다.:");
				retry=1;
				}else {
					retry=0;
				}
			}while(retry==1);
			System.out.println("입급하실금액을 입력해주십시오:");
			System.out.print("입금액:");
			 long money=sca.nextInt();
			 if(money<0) {
				 System.out.println("금액이 이상합니다 ");
				 end.endporss(10);
				 }
				 
				long dbmoney=search.dbmoney(renum);
			 money +=dbmoney;
			 search.updb(renum, money);
			 
			 long outmoney=search.dbmoney(renum);
			 System.out.println("현재잔액:"+outmoney);
			 end.endporss(3);
				}
		}
		 
	}




