package _08_Array2;

public class _02_test {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},
				  {6,7,8,9,10},
				  {11,12,13,14,15},
				  {16,17,18,19,20},
				  {21,22,23,24,25}};
		// 2. 2차원 배열 a의 3번째 행에서 짝수의 값만 출력하시오.
		for (int i = 0; i < a[0].length; i++) {
			if (a[2][i] % 2 == 0)
				System.out.println(a[2][i]);
		}
		
		// 모든 값을 출력하기 위해 for문을 사용
		// 3번째 행이라는 조건 + 짝수의 값이라는 조건
		// a[2][i]의 value값을 2로 나눴을 때 0이어야함
		// i에 모든 열의 index값이 들어가야하므로 i는 0부터 a[0].length-1까지 입력되어야함
		// 조건에 해당하는 모든 값을 출력하기 위해 sysout
		
	}

}
