package _16_Static_Final_Test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 메인메뉴는 학생관리, 교과목관리, 로그인
		// 로그인 하면 수강신청 메뉴와 신청리스트 메뉴가 나온다.
		
		
		Scanner in = new Scanner(System.in);
		
		StudentM stdM = new StudentM();
		SubjectM subM = new SubjectM();
		Login log = new Login();
		
		stdM.subM = subM;
		subM.stdM = stdM;
		log.subM = subM;
		log.stdM = stdM;
		subM.log = log;
		stdM.log = log;
		
		while (true) {
			System.out.println();
			System.out.println(" - 수강 신청 프로그램 - ");
			System.out.println("1. 학생 관리");
			System.out.println("2. 교과목 관리");
			System.out.println("3. 로그인");
			System.out.println("4. 끝내기");
			String selNum = in.nextLine();
			if (selNum.equals("1"))
				stdM.sManage();
			else if (selNum.equals("2"))
				subM.sManage();
			else if (selNum.equals("3"))
				log.login();
			else if (selNum.equals("3"))
				break;
			else
				System.out.println("다시 입력해주세요.");
		}
	}
	
}
