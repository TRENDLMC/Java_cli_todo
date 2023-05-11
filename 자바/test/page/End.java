package main.page;

import java.util.Scanner;

public class End {
	Scanner sca=new Scanner(System.in);

	
	public void endporss(int x) {
		Mainpage main=new Mainpage();
		String munu;
		switch (x) {
		case 1: munu="생성이"; break;
		case 2: munu="출금이"; break;
		case 3: munu="입급이"; break;
		case 4: munu="이체가"; break;
		case 5: munu="조회가"; break;
		default :munu="오류"; break;
		}
		if(x>0) {
			if(munu.equals("오류")) {
				System.out.println("오류가 발생했습니다 다시 시작합니다");
			}else {
				System.out.println("정상적으로 계좌"+munu+"끝낫습니다");
			}
		}else {
			System.out.println("프로그램을 종료하시겠습니까?");
		}
		System.out.println("종료하시려면 1번 메인메뉴는 2번을 눌러주세요");
		System.out.print("번호:");int end=sca.nextInt();
		if(end==2) {
			main.Page();	
		}else {
			System.exit(1);
		}
	}

}
