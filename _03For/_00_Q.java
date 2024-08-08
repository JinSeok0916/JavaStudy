package _03For;

public class _00_Q {

	public static void main(String[] args) {
		int[] a = {30,40,50,55,65};
		for (int i = 4; i >= 0; i--) {
			System.out.println(a[i]);
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(a[(i + 1) % 5]);
		}
		
		// '배열 순회를 반복'하면서 '값의 조건 판단' 후 출력
		for (int i = 0; i < 5; i++) {
			if (a[i] >= 50) {
				System.out.println(a[i]);
			}
		}
		
		// 50점 이상 점수를 합하시오.
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] >= 50) {
				sum += a[i];
			}
		}
		System.out.println(sum);
		
		// 평균을 구하시오. 단, 50점 이상
		int avg = 0;
		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			if (a[i] >= 50) {
				cnt++;
			}
		}
		avg = sum / cnt;  
		System.out.println(avg);
		// 평균을 구하시오. 단, 최저 점수는 제외
		int min = 100;
		double sum1 = 0;
		double avg1 = 0;
		for (int i = 0; i < 5; i++) {
			if (min > a[i]) {
				min = a[i];
			} 
			sum1 += a[i];
		} 
		avg1 = (sum1 - min) / 4;
		System.out.println(avg1);
		
		
	}

}
