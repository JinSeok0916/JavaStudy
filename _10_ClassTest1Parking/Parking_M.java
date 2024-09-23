package _10_ClassTest1Parking;

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
	
	int cnt = 0;
	public void add() {
		Parking_O car = new Parking_O();
		System.out.println(" - 주차등록할 차번호와 소유자명을 입력하세요. - ");
		car.num = in.nextInt();
		in.nextLine();
		car.name = in.nextLine();
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] == null) {
				carList[i] = car;
				car.pNum = i;
				System.out.println("등록되었습니다.");
				cnt++;
				break;
			}
		}
	}
	
	public void find() {
		System.out.println(" - 조회할 소유자명을 입력하세요. - ");
		String name = in.nextLine();
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] != null && carList[i].name.equals(name)) {
				carList[i].data();
			}
		} 
	}
	
	public void list() {
		System.out.println(" - 전체 등록 현황 보기 - ");
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] != null) {
				carList[i].data();
			}
		}
		System.out.println("총 "+cnt+"대가 등록 되어있습니다.");
		if (cnt == 0) {
			System.out.println("등록된 차가 없습니다.");
		}
	}
	
	public void delete() {
		int dCnt = 0;
		System.out.println(" - 삭제할 차번호 및 소유자명을 입력하세요. - ");
		int num = in.nextInt();
		in.nextLine();
		String name = in.nextLine();
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] != null && carList[i].num == num && carList[i].name.equals(name)) {
				carList[i] = null;
				cnt--;
				dCnt = 1;
				System.out.println("삭제되었습니다.");
			}
		} if (dCnt == 0)
			System.out.println("삭제할 차가 없습니다.");
	}
	
}
