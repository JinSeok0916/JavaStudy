package _02If;

public class _02_Q {

	public static void main(String[] args) {
		// 1. 평균을 저장하는 변수를 만들고 89.2라고 저장하시오.
		//    평균이 80점 이상이면 합격, 80점 미만이면 불합격이라고 출력하시오.
		double avg = 89.2;
		if (avg >= 80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		// 2. level이 1이면 포인트에 30을 더하고
		//	  level이 1이 아니면 포인트에 10을 더하시오.
		//	  sysout을 한 번만 사용하여 최종 포인트를 출력하시오.
		int level = 2;
		int point = 30;
		if (level == 1) {
			point += 30;
		} else if (level != 1) {
			point += 10;
		}
		System.out.println(point);
		
		// 3 . 로또 번호 3번째 값에 80을 더하시오
		int[] lotto = {6,12,33,4,5,26};
		System.out.println(lotto[2] + 80);
		
		// 4. 4번째 번호가 홀수이면 홀수, 짝수이면 짝수라고 출력하시오.
		if (lotto[3] % 2 == 1) {
			System.out.println("홀수");
		} else if (lotto[3] % 2 == 0) {
			System.out.println("짝수");
		}
		
		// 5.홀수인 로또 번호의 합을 구하시오.
		int sum = 0;
		if (lotto[0] % 2 == 1) {
			sum += lotto[0];
		} if (lotto[1] % 2 == 1) {
			sum += lotto[1];
		} if (lotto[2] % 2 == 1) {
			sum += lotto[2];
		} if (lotto[3] % 2 == 1) {
			sum += lotto[3];
		} if (lotto[4] % 2 == 1) {
			sum += lotto[4];
		} if (lotto[5] % 2 == 1) {
			sum += lotto[5];
		} System.out.println(sum);
		
		// 6. 숫자의 모든 합을 구하시오.
		int[] a = {45,34,64,45,24};
		System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
		
		// 7. 철수는 숫자를 0번째 부터 2번째 까지 차례대로 수집했다.
		//	  철수는 숫자의 자릿수를 분해하여 합한 결과 값이 가장 큰 숫자를 선택할 예정이다.
		//    숫자를 분해하는 것은 45인 경우 4+5를 의미한다.
		//    철수가 선택할 숫자는 몇 번째 수집한 숫자인가?
		int[] b = {45,34,64};
		int b1 = (b[0] / 10) + (b[0] % 10);
		int b2 = (b[1] / 10) + (b[1] % 10);
		int b3 = (b[2] / 10) + (b[2] % 10);
		if (b1 > b2 && b1 > b3) {
			System.out.println("첫번째숫자");
		} else if (b2 > b1 && b2 > b3) {
			System.out.println("두번째숫자");
		} else if (b3 > b1 && b3 > b2) {
			System.out.println("세번째숫자");
		} else {
			System.out.println("모든 경우가 동일");
		}
		
		// 8. 네모는 새, 화살표는 총알
		//    총알은 직진으로 움직인다.
		//    총알에 맞는 새의 번호를 출력하시오.
		int[] x = {6,5,9};
		int[] y = {4,10,6};
		int[] i = {3,6,9};
		int[] k = {2,4,6};
		
		if (i[0] == x[0] && k[0] == y[0]) {
			System.out.println("0번새");
		} else if (i[0] == x[1] && k[0] == y[1]) {
			System.out.println("1번새");
		} else if (i[0] == x[2] && k[0] == y[2]) {
			System.out.println("2번새");
		}
		if (i[1] == x[0] && k[1] == y[0]) {
			System.out.println("0번새");
		} else if (i[1] == x[1] && k[1] == y[1]) {
			System.out.println("1번새");
		} else if (i[1] == x[2] && k[1] == y[2]) {
			System.out.println("2번새");
		}
		if (i[2] == x[0] && k[2] == y[0]) {
			System.out.println("0번새");
		} else if (i[2] == x[1] && k[2] == y[1]) {
			System.out.println("1번새");
		} else if (i[2] == x[2] && k[2] == y[2]) {
			System.out.println("2번새");
		}
		
		// 9. 미사일
		int eX1 = 10, eX2 = 15;
		int mX1 = 11, mX2 = 13;
		if (mX1 >= eX1 && mX1 <= eX2) {
			 System.out.println("hit");
		} else if (mX2 >= eX1 && mX2 <= eX2) {
			 System.out.println("hit");
		} else {
			 System.out.println("miss");
		}
		
		
		
		
		
	}

}
