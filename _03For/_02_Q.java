package _03For;

public class _02_Q {

	public static void main(String[] args) {
		// 1. 100부터 999까지의 숫자 중에서 홀수만 출력하시오.
		System.out.println("문제 1");
		for (int a = 100; a < 1000; a++) {
			if (a % 2 == 1) {
				System.out.println(a);
			}
		}
				
		// 2. 1부터 100까지 숫자 중에서 홀수의 총합을 구하시오.
		System.out.println("문제 2");
		int c = 0;
		for (int b = 1; b <= 100; b++) {
			if (b % 2 == 1) {
				c += b;
			}
		}
		System.out.println(c);
		
		// 3. 다음과 같이 출력하시오. 10 9 8 7 6 5 4 3 2 1
		System.out.println("문제 3");
		for (int d = 10; d > 0; d--) {
			if (d == 1) {
				System.out.println(1);
			} else
			System.out.print(d+" ");
		}
		
		// 4. arr배열에서 배열의 값이 짝수인 것만 출력하시오.
		System.out.println("문제 4");
		int[] arr = {45,23,25,64,3,24,28};
		for (int e = 0; e < 7; e++) {
			if (arr[e] % 2 == 0) {
				System.out.println(arr[e]);
			}
		}
		
		// 6. arr배열에서 배열의 값이 홀수인 곳의 인덱스만 출력하시오.
		System.out.println("문제 6");
		for (int e = 0; e < 7; e++) {
			if (arr[e] % 2 == 1) {
				System.out.println(e);
			}
		}
		
		// 7. arr배열의 값을 모두 더한 총합을 구하시오.
		System.out.println("문제 7");
		int f = 0;
		for (int e = 0; e < 7; e++) {
			f += arr[e];
		}
		System.out.println(f);
		
		// 8. arr배열에서 짝수는 모두 몇개인가요?
		System.out.println("문제 8");
		int arrCnt = 0;
		for (int e = 0; e < 7; e++) {
			if (arr[e] % 2 == 0) {
				arrCnt++;
			}
		}
		System.out.println(arrCnt);
		
		// 9. 아래 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요.
		System.out.println("문제 9");
		String test = "abcdeabce";
		int cntA = 0;
		for (int i = 0; i < 9; i++) {
			char aaa = test.charAt(i);
			if (aaa == 'a') {
				cntA++;
			}
		}
		System.out.println(cntA);
		
		// 10. arr배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
		System.out.println("문제 10");
		int g = arr[0];
		for (int e = 0; e < 7; e++) {
			if (arr[e] > g) {
				g = arr[e];
				System.out.println(g+", "+e);
			}
		}
		
		// 11. 범인 숫자 구하기.
		//	   범인은 100부터 999까지 숫자 중에 여러명이다.
		//	   범인의 특징은 숫자의 각 자릿수를 더한 값이 짝수이다. 범인의 숫자를 모두 찾으시오.
		System.out.println("문제 11");
		for (int h = 100; h < 1000; h++) {
			if (((h/100) + (h%100)/10 + (h%10)) % 2 == 0) {
				System.out.println(h);
			}
		}
		
		// 12. A배열에서 0은 터널이다. 가장 긴 터널의 길이를 구하시오.
		System.out.println("문제 12");
		int[] A = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,2,2,0,0,0,0,0,3,3};
		int i = 0;
		int k = 0;
		int m = 0;
		int n = 0;
		for (int l = 0; l < 24; l++) {
			if (A[l] == 0 && (A[l] == A[l+1]) && (A[l] != A[l-1])) {
				i = l;
			} if (A[l] == 0 && (A[l] == A[l-1]) && (A[l] != A[l+1])) {
				k = l;
			} if (k - i > 0) {
				m = k - i;
			} if (m > n) {
				n = m;
			}
		}
		System.out.println("길이 "+n);
		
		// 13. A배열에서 숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.
		System.out.println("문제 13");
		int o = 0;
		int p = 0;
		int q = 0;
		int r = 0;
		int s = 0;
		int t = 0;
		for (t = 0; t < 24; t++) {
			if (t == 0) {
				if (A[t] == A[t+1]) {
					o = t;
				}
			} if (t == 23) {
				if (A[t] == A[t-1]) {
					p = t;
				}
			} if (t != 0 && t != 23 && A[t] == A[t+1] && (A[t] != A[t-1])) {
				o = t;
			} if (t != 0 && t != 23 && A[t] == A[t-1] && (A[t] != A[t+1])) {
				p = t;
			} if ((p - o) > 0) {
				q = p - o + 1;
			} if (q > r) {
				r = q;
				s = A[t-1];
			}
		}
		System.out.println("가장 긴 숫자 "+s+" 길이 "+r);
		
		// 14. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요.
		System.out.println("문제 14");
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		int x = 0;
		int y = 0;
		int z = 0;
		int v = 0;
		char textT = ' ';
		for (int u = 0; u < 22; u++) {
			char w = ttt.charAt(u);
			if (u == 0) {
				if (w == ttt.charAt(u+1)) {
					x = u;
				}
			}
			if (u == 21) {
				if (w == ttt.charAt(u-1)) {
					y = u;
				}
			}
			if (u != 0 && u != 21) {
				if (w == ttt.charAt(u+1) && w != ttt.charAt(u-1)) {
					x = u;
				}
			}
			if (u != 0 && u != 21) {
				if (w == ttt.charAt(u-1) && w != ttt.charAt(u+1)) {
					y = u;
				}
			}
			if ((y - x) > 0) {
				z = y - x + 1;
			}
			if (z > v) {
				v = z;
				textT = ttt.charAt(u);
			}
		}
		System.out.println("알파벳 이름 "+textT+" 길이 "+v);
		
		// 15 . 아래 문자열을 압축하시오. 압축하는 방법 : a2b3c3a4d2b3a5
		System.out.println("문제 15");
		String text ="aabbbcccaaaaddbbbaaaaa";
		
		
		
		
		

	}

}
