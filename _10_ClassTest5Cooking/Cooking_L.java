package _10_ClassTest5Cooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Cooking_L {
	Scanner in = new Scanner(System.in);
	Cooking_M m = null;
	String chef = null;
	ArrayList<String> dish = new ArrayList<>();
	int cnt = 0;
	int idx = 0;
	
	public void addC() {
		System.out.println();
		System.out.println("요리사 이름을 입력하세요.");
		System.out.print("요리사 이름 : ");
		chef = in.nextLine();
	}
	
	public void addD() {
		String dishN = null;
		for (int j = 0; j < 2; j ++) {
			System.out.println();
			System.out.println("등록할 요리의 요리사를 입력하세요.");
			System.out.print("요리사 이름 : ");
			String chefN = in.nextLine();
			System.out.println("0번 인덱스의 값"+m.list.get(0));
			System.out.println("리스트 길이"+m.list.size());
			for (int i = 0; i < m.list.size(); i++) {
				if (m.list.get(i).chef.equals(chefN)) {
					idx = i;
					System.out.println();
					System.out.println("등록할 요리의 이름을 입력하세요.");
					System.out.print("요리 이름 : ");
					dishN = in.nextLine();
					dish.add(dishN);
					cnt = 1;
					j = 2;
				}
			}
			if (cnt == 0) {
				System.out.println("등록되지 않은 요리사입니다.");
				j = 0;
			}
			m.list.get(idx).dish = dish;
		}
	}
	
	
	
}
