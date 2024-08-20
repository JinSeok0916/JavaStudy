package _05_2For;

import java.util.Scanner;

public class _02_Q {
	
	public static void main(String[] args) {
		// 문제 1. a로 나누어 떨어지는 배열의 값을 모두 출력하시오.
		System.out.println("문제 1번");
		int[] arr = {3,45,26,50,74};
		int a = 5;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % a == 0) {
				System.out.println(arr[i]+" ");
			}
		}
		
		// 문제 2. 배열의 평균값을 구하시오. 소수점 표현하시오.
		System.out.println("문제 2번");
		int[] arr1 = {89,90,91,92,93,94,95,96,97,98,99};
		double sumArr1 = 0; 
		double avgArr1 = 0;
		for (int i = 0; i < arr1.length; i++) {
			sumArr1 += arr1[i];
		}
		avgArr1 = sumArr1 / arr1.length;
		System.out.println(avgArr1);
		
		// 문제 3. 팩토리얼의 합 구하기
		//		  1부터 10까지 숫자의 각 팩토리얼의 합을 구하시오. 4037913
		System.out.println("문제 3번");
		int fac = 1;
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			for (int k = 1; k < i+1; k++) {
				fac *= k;
			}
			sum += fac;
			fac = 1;
		}
		System.out.println(sum);
		
		// 문제 4. 다음 조건에 따라 오름차순으로 정렬하시오.
		//		  1. 가장 큰 값을 찾아서 맨 뒤 값과 교환한다.
		//		  2. 두번째로 큰 값을 찾아서 맨 뒤에서 두번째 자리의 값과 교환한다.
		//		  3. 세번째로 큰 값을 찾아서 맨 뒤에서 세번째 자리의 값과 교환한다.
		//		  4. 오름차순으로 정렬이 될 때 까지 반복한다.
		System.out.println("문제 4번");
		int[] b = {93,45,83,58,75,56};
		int maxB = b[0];
		int c = 0;
		for (int k = 0; k < 5; k++) {
			for (int i = 0; i < b.length-k; i++) {
				if (maxB < b[i]) {
					maxB = b[i];
					c = i;
				}
			}
			b[c] = b[b.length-k-1];
			b[b.length-k-1] = maxB;
			maxB = 0;
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		// 문제 5. carnum배열의 인덱스가 0인 값부터 주차장에 들어온다.
		//		  parking의 인덱스 번호가 주차번호이다.
		//		  자동차 번호의 마지막 번호는 해당 차량이 주차할 번호이다.
		//		  만약 주차번호에 다른 차량이 주차되어 있으면 다음 주차번호에 주차를 한다.
		//		  (이때, 다음 주차번호에도 차량이 있으면 주차불가이다.)
		//		  주차가 끝난 후 주차번호와 주차한 차량 번호를 출력하시오.
		System.out.println("문제 5번");
		int[] carNum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599};
		int[] parking = new int[10];
		for (int i = 0; i < carNum.length-1; i++) {
			if (parking[carNum[i] % 10] == 0) {
				parking[carNum[i] % 10] = carNum[i];
			} else if (parking[carNum[i] % 10] != 0) {
				parking[(carNum[i] % 10) + 1] = carNum[i];
				if (parking[(carNum[i] % 10) + 1] != 0) {
					
				}
			}
		}
		if (parking[carNum[carNum.length-1] % 10] == 0) {
			parking[carNum[carNum.length-1] % 10] = carNum[carNum.length-1];
		}
		for (int i = 0; i < parking.length; i++) {
			System.out.println(parking[i]);
		}
		
		// 문제 6. 키보드로 아이디를 입력받는다.
		//		  입력 받은 아이디에 특수 문자가 포함 되었는지 확인한다.(유효성)
		//		  특수 문자는 @ 한개로 정의한다.
		//		  특수 문자가 몇개 포함되었는지 출력합니다.
		System.out.println("문제 6번");
		Scanner in = new Scanner(System.in);
		String i = in.nextLine();
		int cntI = 0;
		for (int k = 0; k < i.length(); k++) {
			if (i.charAt(k) == '@') {
				cntI++;
			}
		}
		if (cntI > 0) {
			System.out.println("특수문자가 "+cntI+"개 포함되어 있습니다.");
		} if (cntI == 0) {
			System.out.println("특수문자가 포함되어 있지 않습니다.");
		}
		
		// 문제 7. 키보드로 아이디를 입력받는다.
		//		  입력 받은 아이디에 특수 문자가 포함되었는지 확인한다.(유효성)
		//		  특수 문자는 String sign = "!@#$%^&*"로 정의한다.
		//		  특수 문자가 몇개 포함되었는지 출력합니다.
		System.out.println("문제 7번");
		String m = in.nextLine();
		String sign = "!@#$%^&*";
		int cntSign = 0;
		for (int k = 0; k < m.length(); k++) {
			for (int l = 0; l < sign.length(); l++) {
				if (m.charAt(k) == sign.charAt(l)) {
					cntSign++;
				}
			}
		}
		if (cntSign > 0) {
			System.out.println("특수문자가 "+cntSign+"개 포함되어 있습니다.");
		} if (cntSign == 0) {
			System.out.println("특수문자가 포함되어 있지 않습니다.");
		}
		
		
	}
}
