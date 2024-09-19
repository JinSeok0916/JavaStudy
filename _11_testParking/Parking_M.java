package _11_testParking;

import java.util.Scanner;

public class Parking_M {
	Scanner in = new Scanner(System.in);
	Parking_O[] carList = new Parking_O[7];
	
	Parking_M() {
		while (true) {
			System.out.println("1. 등록");
			System.out.println("2. 조회");
			System.out.println("3. 전체보기");
			System.out.println("4. 삭제");
			System.out.println("5. 끝내기");
			int mNum = in.nextInt();
			in.nextLine();
			if (mNum == 1) {
				add();
			} else if (mNum == 2) {
				find();
			} else if (mNum == 3) {
				list();
			} else if (mNum == 4) {
				delete();
			} else if (mNum == 5) {
				break;
			} else {
				System.out.println("1에서 5 사이의 숫자를 입력해주세요.");
				continue;
			}
		}
	}
	public void add() {
		Parking_O car = new Parking_O();
		System.out.println(" - 주차등록할 차번호와 소유자명을 입력하세요. - ");
		car.num = in.nextInt();
		in.nextLine();
		car.name = in.nextLine();
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] == null) {
				carList[i] = car;
				break;
			}
		}
	}
	public void find() {
		System.out.println(" - 조회할 차번호 및 소유자명을 입력하세요. - ");
		int num = in.nextInt();
		in.nextLine();
		String name = in.nextLine();
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] != null && carList[i].num == num && carList[i].name.equals(name)) {
				carList[i].data();
				break;
			}
			else {
				System.out.println("등록된 차가 없습니다.");
				break;
			}
		} 
		
	}
	public void list() {
		System.out.println(" - 전체 등록 현황 보기 - ");
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] != null) {
				carList[i].data();
				break;
			}
			else {
				System.out.println("등록된 차가 없습니다.");
				break;
			}
		}
	}
	public void delete() {
		System.out.println(" - 삭제할 차번호 및 소유자명을 입력하세요. - ");
		int num = in.nextInt();
		in.nextLine();
		String name = in.nextLine();
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] != null && carList[i].num == num && carList[i].name.equals(name))
				carList[i] = null;
		}
	}
	
}
