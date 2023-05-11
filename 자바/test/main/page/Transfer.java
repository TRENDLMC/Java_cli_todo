package main.page;

import java.util.Scanner;

public class Transfer {
	Scanner sca= new Scanner(System.in);
	Search search=new Search();
	int retry;
	String renum;
	String retonum;
	
	void moneyTransfor() {
		do {
		do {
		System.out.println("보낼 계좌를 입력해주세요");
		System.out.print("계좌번호:");
		String fromnum=sca.next();
		String fromnumO=search.cunumsearch(fromnum);
		 if(!fromnum.equals(fromnumO)) {
			System.out.println("존재하지 않는 계좌번호입니다 다시입력해주세요");
			retry=0;
		}else {
			retry=1;
			renum=fromnum;
			}
	}while(retry==0);
			System.out.println("계좌의 비밀번호를 입력하여 주십시오.");
			System.out.print("비밀번호:"); int frompass=sca.nextInt();
			int frompassO=search.sepass(renum);
			if(frompass!=frompassO) {
				retry=0;
				System.out.println("비밀번호가틀렸습니다.");
				System.out.println("처음부터 다시 입력해 주십시오");
			}else {
				retry=1;
			}
		}while(retry==0);
		do {
			System.out.println("보내실 계좌를 입력해주세요");
			System.out.print("상대방계좌번호:");
			String tonum=sca.next();
			String tonumO=search.cunumsearch(tonum);
			 if(!tonum.equals(tonumO)) {
				System.out.println("존재하지 않는 계좌번호입니다 다시입력해주세요");
				retry=0;
			}else {
				retry=1;
				retonum=tonum;
				}
		}while(retry==0);
		do {
		System.out.println("송금하실 금액을 입력해 주십시오");
		System.out.print("금액:"); long frommoney=sca.nextLong();
		if(frommoney<0) {
			System.out.println("금액이 이상합니다 다시입력해 주십시오");
			retry =0;
		}else {
			long tomoney=search.dbmoney(retonum);
			long russmoney=search.dbmoney(renum);
			 if(russmoney>frommoney) {
				long ehs= russmoney-frommoney;
				search.updb(renum, ehs);
				long toehs=tomoney+frommoney;
				search.updb(retonum, toehs);
			 }else {
				 System.out.println("잔액이 모자릅니다");
			 	}
			}
		}while(retry==0);
		System.out.println("정상적으로 이체가끝낫습니다");
		System.out.println("종료하시려면 1번 메인메뉴는 2번을 눌러주세요");
		System.out.print("번호:");int end=sca.nextInt();
		if(end==2) {
			Mainpage main=new Mainpage();
		
			main.Page();	
		}else {
			return;
		}
	}
}
