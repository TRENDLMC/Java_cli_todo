package main.page;

import java.util.Scanner;

public class Transfer {
	Sqltest sql= new Sqltest();
	End end= new End();
	Scanner sca= new Scanner(System.in);
	
	void moneyTransfor() {
		Senumber sec=new Senumber();
		long ehs=0;
		String fromrenum= sec.seNumber(2);
		sec.sePass(fromrenum);
		String torenum= sec.seNumber(3);
		System.out.println("송금하실 금액을 입력해 주십시오");
		System.out.print("금액:"); 
		long frommoney=sca.nextLong();
		if(frommoney<0) {
			System.out.println("금액이 이상합니다");
			end.endporss(7);
		}else {
			long tomoney=sql.seMon(torenum);
			long russmoney=sql.seMon(fromrenum);
			 if(russmoney>frommoney) {
				ehs= russmoney-frommoney;
				sql.updb(fromrenum, ehs);
				long toehs=tomoney+frommoney;
				sql.updb(torenum, toehs);
			 }else {
				 System.out.println("잔액이 모자릅니다");
				 end.endporss(7);
			 	}
			}
		System.out.println("잔액:"+ehs);
		end.endporss(4);
	}
}
