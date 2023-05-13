package main.page;

import java.util.Scanner;

public class Transfer {
	End end= new End();
	Scanner sca= new Scanner(System.in);
	Search search=new Search();
	int retry;
	String renum;
	String retonum;
	
	void moneyTransfor() {
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
				System.out.println("비밀번호가틀렸습니다.");
				end.endporss(10);
			}do {
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
		
		System.out.println("송금하실 금액을 입력해 주십시오");
		System.out.print("금액:"); long frommoney=sca.nextLong();
		if(frommoney<0) {
			System.out.println("금액이 이상합니다 다시입력해 주십시오");
			end.endporss(10);
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
				 end.endporss(10);
			 	}
			}
		end.endporss(4);
	}
}
