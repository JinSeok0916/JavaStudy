package _08_Array2;

public class _05_test {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},
					  {6,7,8,9,10},
					  {11,12,13,14,15},
					  {16,17,18,19,20},
					  {21,22,23,24,25}};
		// 5. 전체 배열의 값 중 홀수를 0으로 마스킹 하고, 마스킹 된 결과 2차원 배열을 출력하시오.
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[0].length; k++) {
				if (a[i][k] % 2 == 1) {
					a[i][k] = 0;
				}
				System.out.print(a[i][k]+" ");
			}
			System.out.println();
		}
		
		// 전체 배열의 value값을 체크하기 위해 for문 2개 작성
		// value값이 홀수인지 확인하고 마스킹하기 위해
		// value값을 2로 나눈 값이 1인 경우, value값에 0을 대입
		// 전체 배열을 출력하기 위해 for문 안에 sysout 입력
		
	}

}
