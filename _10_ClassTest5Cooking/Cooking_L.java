package _10_ClassTest5Cooking;

import java.util.Scanner;

public class Cooking_L {
	Scanner in = new Scanner(System.in);
	Cooking_M m = null;
	String chef = null;
	String dish = null;
	int cnt = 0;
	
	public void addC() {
		System.out.println();
		System.out.println("요리사 이름을 입력하세요.");
		System.out.print("요리사 이름 : ");
		chef = in.nextLine();
		
	}
	
	public void addD() {
		for (int j = 0; j < 2; j ++) {
			System.out.println();
			System.out.println("등록할 요리의 요리사를 입력하세요.");
			System.out.print("요리사 이름 : ");
			chef = in.nextLine();
			for (int i = 0; i < m.list.size(); i++) {
				if (m.list.get(i).chef.equals(chef)) {
					System.out.println();
					System.out.println("등록할 요리의 이름을 입력하세요.");
					System.out.print("요리 이름 : ");
					dish = in.nextLine();
					cnt = 1;
					j = 2;
				}
			}
			if (cnt == 0) {
				System.out.println("등록되지 않은 요리사입니다.");
				j = 0;
			}
		}
	}
	
	
	
}
