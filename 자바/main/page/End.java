package main.page;

import java.util.Scanner;

public class End {
	public void endporss(int x) {
		Mainpage main=new Mainpage();
		Scanner sca=new Scanner(System.in);
		Sqltset sql=new Sqltset();
		End end=new End();
		deposit_and_withdrawal and= new deposit_and_withdrawal();
		Search search=new Search();
		Create create=new Create();
		Transfer tra=new Transfer();
		String munu=null;
		int ends=0;
		switch (x) {
		case 1: munu="생성이"; break;
		case 2: munu="출금이"; break;
		case 3: munu="입급이"; break;
		case 4: munu="이체가"; break;
		case 5: munu="조회가"; break;
		case 7: munu="이체"; break;
		case 8: munu="출금"; break;
		case 9: munu="입금"; break;
		case 10:munu="비밀번호오류";break;
		}
		if(x>0) {
			if(x>=6 && x < 10) {
				do {
				System.out.println(munu+"오류가 발생했습니다 다시 시작합니다");
				System.out.println("종료하시려면 1번 메인메뉴는 2번을 이전메뉴로 돌아갈려면 3번을 눌러주세요");
				System.out.print("번호:");ends=sca.nextInt();
				}while(ends!=1||ends!=2||ends!=3);
				if(ends==3) {
					 switch (x) {
					 case 6:search.sec();break;
					 case 7:tra.moneyTransfor();break;
					 case 8:and.meney(1);break;
					 case 9:and.meney(2);break;}
				}else if(ends==2) {
					main.Page();	
				}else {
					System.exit(1);	
				}
			}else if(x==10) {
				System.out.println("비밀번호오류가발생했습니다");
				System.out.println("초기메뉴로돌아갑니다");
				main.Page();
			}
			else {
				System.out.println("정상적으로 계좌"+munu+"끝낫습니다");
			}
		}else {
			System.out.println("프로그램을 종료하시겠습니까?");
		}do {
		System.out.println("종료하시려면 1번 메인메뉴는 2번을 눌러주세요");
		System.out.print("번호:");ends=sca.nextInt();
		}while(ends!=2||ends!=1);
		if(ends==2) {
			main.Page();	
		}else {
			System.exit(1);
		}

	}
}

