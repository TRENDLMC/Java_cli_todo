package main.page;

import java.util.Scanner;

public class Mainpage {
	Deleacc del=new Deleacc();
	End end=new End();
	Search search=new Search();
	Create create=new Create();
	D_A_W and= new D_A_W();
	Transfer tra=new Transfer();
	Scanner sca=new Scanner(System.in);
	int se;
	
	public void Page() {
		do {
		System.out.println("+---------------이젠은행------------------------------------+");
		System.out.println("|1.계좌생성 2.예금출금 3.예금입금 4.예금이체 5.잔액조회 6.계좌삭제 7.종료|");
		System.out.println("+---------------------------------------------------------+");
		System.out.println("사용하실 서비스 번호를 입력해주십시오");
		System.out.print("서비스번호:");
		se=sca.nextInt();
		if(se>=8||se<=0) {
			System.out.println("존재하지 않는 서비스 번호입니다.");
		}
		}while(se>=8||se<=0);
		
		switch (se) {
		case 1:create.NoCreate(); break;
		case 2:and.meney(1); break;
		case 3:and.meney(2); break;
		case 4:tra.moneyTransfor();break;
		case 5:search.sec(); break;
		case 6:del.delacc();break;
		case 7:end.endporss(-1);break;
		}


	}
}