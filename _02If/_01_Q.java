package _02If;

public class _01_Q {

	public static void main(String[] args) {
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
