package main.page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Search {
	 Scanner sca=new Scanner(System.in);
	 String renum;
	public void sec() {
		End end=new End();
		Sqltest sql=new Sqltest();
		Senumber sec=new Senumber();
		String num=sec.seNumber(1);
		sec.sePass(num);
		sql.seAcc(num);
		end.endporss(5);
	}
	
}
