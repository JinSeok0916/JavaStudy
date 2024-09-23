package _10_ClassTest2Train;

import java.util.Scanner;

public class Train_M {
	//등록 전체보기 수정
	Scanner in = new Scanner(System.in);
	Train_O[] trainList = new Train_O[4];
	int cnt = 0;
	Train_M() {
		base();
		while (true ) {
			
			System.out.println();
			menu();
			System.out.println();
			int mNum = in.nextInt();
			in.nextLine();
			if (mNum == 1)
				add();
			else if (mNum == 2)
				list();
			else if (mNum == 3)
				mod();
			else if (mNum == 4)
				fix();
			else if (mNum == 5)
				fixList();
			else if (mNum == 6)
				break;
			else
				System.out.println("1에서 5 사이의 수를 입력하세요.");
		}
	}
	
	public void menu() {
		System.out.println(" - 메뉴 - ");
		System.out.println("1. 등록하기");
		System.out.println("2. 전체보기");
		System.out.println("3. 정보수정하기");
		System.out.println("4. 수리정보수정하기");
		System.out.println("5. 수리정보");
		System.out.println("6. 종료하기");
	}
	
	public void base() {
		for (int i = 0; i < trainList.length; i++) {
			Train_O train = new Train_O();
			train.num = (i+1)*1111;
			if (i % 2 == 1)
				train.type = "새마을";
			else 
				train.type = "무궁화";
			trainList[i] = train;
		}
	}
	
	
	public void add() {
		System.out.println("기차번호를 입력하세요.");
//		Train_O train = new Train_O();
		int num = in.nextInt();
		in.nextLine();
		for (int i = 0; i < trainList.length; i++) {
			if (trainList[i].num == num) {
				System.out.println("도착시간을 입력하세요.");
				String time = in.nextLine();
				trainList[i].time = time;
				System.out.println("입력되었습니다.");
				cnt = 1;
			}
		} if (cnt == 0) {
			System.out.println("입력오류입니다.");
		}
		cnt = 0;
	}
	
	public void list() {
		System.out.println("기차번호 / "+"기차종류 / "+"도착시간");
		for (int i = 0; i < trainList.length; i++) {
			if (trainList[i] != null) {
				if (trainList[i].fix == 0) {
					if (trainList[i].type.equals("새마을")) {
						trainList[i].type += "*";
					}
					trainList[i].tData();
				}
			}
		}
	}
	
	public void mod() {
		System.out.println("원하는 기차번호를 입력하세요.");
		int num = in.nextInt();
		in.nextLine();
		for (int i = 0; i < trainList.length; i++) {
			if (trainList[i].num == num) {
				cnt = 1;
				System.out.println("해당하는 도착시간을 입력하세요");
				String time = in.nextLine();
				if (trainList[i].time.equals(time)) {
					System.out.println("수정할 도착시간을 입력하세요.");
					time = in.nextLine();
					trainList[i].time = time;
					System.out.println("수정되었습니다.");
				} else {
					System.out.println("해당하는 기차가 없습니다.");
				} break;
			}
		} if (cnt == 0) {
			System.out.println("입력오류입니다.");
		}
		cnt = 0;
	}
	
	int fixCnt = 0;
	public void fix() {
		System.out.println("수리정보를 수정할 기차의 번호를 입력하세요.");
		int num = in.nextInt();
		in.nextLine();
		for (int i = 0; i < trainList.length; i++) {
			if (trainList[i].num == num) {
				cnt = 1;
				System.out.println("수리하려면 1을 수리가 완료되었다면 0을 입력하세요.");
				int fix = in.nextInt();
				in.nextLine();
				if (trainList[i].fix == 1 && fix == 0) {
					trainList[i].fix = fix;
					fixCnt--;
					System.out.println("수정되었습니다.");
				} else if ( trainList[i].fix == 0 && fix == 1) {
					trainList[i].fix = fix;
					fixCnt++;
					System.out.println("수정되었습니다.");
				} else if ( trainList[i].fix == 1 && fix == 1) {
					System.out.println("이미 수리중인 기차입니다.");
				} else if ( trainList[i].fix == 0 && fix == 0) {
					System.out.println("이미 수리가 완료된 기차입니다.");
				} else {
					System.out.println("입력오류입니다.");
				}
			} 
		} if (cnt == 0) {
			System.out.println("입력오류입니다.");
		}
		cnt = 0;
	}
	
	public void fixList() {
		if (fixCnt > 0) {
			System.out.println("수리 중인 기차입니다.");
			for (int i = 0; i < trainList.length; i++) {
				if (trainList[i].fix == 1) {
					System.out.println("기차번호 / "+"기차종류");
					trainList[i].fixData();
				}
			}
		} if (fixCnt == 0) {
			System.out.println("수리 중인 기차가 없습니다.");
		}
	}
	
}
