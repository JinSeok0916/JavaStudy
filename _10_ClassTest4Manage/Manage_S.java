package _10_ClassTest4Manage;

import java.util.Scanner;

public class Manage_S {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Manage_M manage = new Manage_M();
		Manage_EM eManage = new Manage_EM();
		manage.eventM = eManage;
		eManage.manage = manage;
		
		while (true) {
			System.out.println();
			System.out.println(" - 고객관리 및 이벤트관리 프로그램 - ");
			System.out.println("1. 고객관리");
			System.out.println("2. 이벤트관리");
			System.out.println("3. 종료하기");
			int selNum = in.nextInt();
			in.nextLine();
			if (selNum == 1) {
				manage.restart();
			} else if (selNum == 2) {
				eManage.restart();
			} else if (selNum == 3) {
				System.out.println();
				break;
			} else {
				System.out.println();
				System.out.println("1 에서 3 사이의 숫자를 입력하세요.");
			}
			
		}
	}

}
