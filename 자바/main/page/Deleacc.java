package main.page;

import java.util.Scanner;

public class Deleacc {
	Scanner sca=new Scanner(System.in);
	
	
	public void  delacc() {
		End end=new End();
		Senumber se=new Senumber();
		Mainpage mainpage=new Mainpage();
		Sqltest sql=new Sqltest();
		System.out.println("계좌 삭제메뉴입니다");
		System.out.println("이전메뉴로돌아가실려면 1번을 눌러주세요");
		System.out.println("계좌삭제를 진행하시려면 아무키나 눌러주세요");
		String retr=sca.next();
		if(retr.equals("1")) {
			mainpage.Page();
		}else {
		String num=se.seNumber(6);
		se.sePass(num);
		do {
		System.out.println("계좌를 삭제하시겠습니까?");
		System.out.println("1...네     2..아니요");
		System.out.print("입력:");
		retr=sca.next();
		}while(!retr.equals("1")&&!retr.equals("2"));
		if(retr.equals("1")) {
			sql.del(num);
			System.out.println("정상적으로 삭제가 완료되었습니다");
			end.endporss(-2);
		}else {
			System.out.println("이전메뉴로 돌아갑니다");
			end.endporss(-2);
		}
		
		}
		
	}
}
