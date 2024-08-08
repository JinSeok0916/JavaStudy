package _02If;

public class _01_Q {

	public static void main(String[] args) {
		// 나이가 18세 미만인 학생은 수강신청할 수 없고
		// 60~69점의 학생은 수강신청이 가능하며 별표를 추가한다.
		// 90점 이상의 학생은 A
		// 80이상 90점 미만의 학생은 B
		// 70이상 80점 미만의 학생은 C
		// 60이상 70점 미만의 학생은 D
		// 60점 미만의 학생은 F 등급을 부여한다.
		int age = 19;
		int point = 69;
		if (age >= 18) {
			if (point >= 90) {
				System.out.println("A" + "수강신청 불가능");
			} else if (point >= 80) {
				System.out.println("B" + "수강신청 불가능");
			} else if (point >= 70) {
				System.out.println("C" + "수강신청 불가능");
			} else if (point >= 60) {
				System.out.println("D" + "★" + "수강신청 가능");
			} else {
				System.out.println("F" + "수강신청 불가능");
			}
		} else {
			System.out.println("수강신청 불가능");
		}
		
		// a지점과 b지점과 나의 위치가 주어졌을 때
		// 내가 a와 b지점 사이에 있으면 '도로 위'를 출력한다.
		// 내 위치와 a, b지점 사이의 거리를 계산해
		// 더 가까운 쪽을 기준으로 얼마만큼 떨어져 있는지 출력한다.		
		int a = 10;
		int b = 20;
		int my = 15;
		if (my >= a && my <= b) {
			System.out.println("도로 위");
		} else {
			System.out.println("도로가 아님");
		}
		
		if (my >= a && my <= b) {
			System.out.println("up1 : a 지점으로 부터 "+(my - a)+"만큼 떨어져 있습니다.");
			if ((b - my) >= (my - a)) {
				System.out.println("up2 : a 지점으로 부터 "+(my - a)+"만큼 떨어져 있습니다.");
			} else {
				System.out.println("up2 : b 지점으로 부터 "+(b - my)+"만큼 떨어져 있습니다.");
			}
		}
		
		
		
	}

}
