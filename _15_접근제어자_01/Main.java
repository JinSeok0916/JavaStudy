package _15_접근제어자_01;

import _15_접근제어자_02.MemberOne;

public class Main {

	public static void main(String[] args) {

		MemberOne m = new MemberOne();
	
//		m.name = "hong";	// error > name변수의 접근제어자가 dafault라서
		
		m.prt();			// 가능
		
		m.setName("choi");
		
	}

}
