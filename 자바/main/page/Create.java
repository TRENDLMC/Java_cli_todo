package main.page;import java.util.Scanner;

public class Create {
	
	int re;
	int pass;
	
	void NoCreate() {
		String ax=null;
		String al=null;
		Sqltest sql=new Sqltest();
		Scanner sca=new Scanner(System.in);
		End end=new End();
		System.out.println("계좌를 생성합니다.");
		System.out.println("-------------------");
		System.out.print("|이름:"); String name=sca.next();
		do {
		System.out.print("|비밀번호:"); pass=sca.nextInt();
		System.out.print("|비밀번호확인:");int passto=sca.nextInt();
			if(pass!=passto) {
			System.out.println("비밀번호가 다릅니다재입력바랍니다");
			re=1;
			}else {
			re=0;
			}
		}while(re==1);
		
		System.out.print("|초기입금액:"); int meney=sca.nextInt();
		System.out.println("-------------------");
		do {
		int a=(int)(Math.random()*10000)+1;
		 ax=String.valueOf(a);
		}while(ax.equals(al=sql.seNum(ax)));
		
		sql.creNum(name, pass, meney,ax);
		
		sql.seAcc(ax);
		
		end.endporss(1);
	
	}
}
	

