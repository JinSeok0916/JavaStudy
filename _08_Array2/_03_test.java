package _08_Array2;

public class _03_test {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},
					  {6,7,8,9,10},
					  {11,12,13,14,15},
					  {16,17,18,19,20},
					  {21,22,23,24,25}};
		// 3. 2차원 배열의 2열의 모든 값을 행의 순서대로 출력하시오.
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i][2]);
		}
		
		// 모든 값을 출력하기 위해 for문 작성
		// 2열의 모든 값이 조건이므로 a[i][2]로 고정
		// i는 모든 행의 값이 조건이므로 0부터 a.length-1까지 입력되어야함
		// 순서대로이기 때문에 다른 조건 없이 출력을 위해 sysout 작성
		
	}

}
