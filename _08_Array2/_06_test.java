package _08_Array2;

public class _06_test {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},
					  {6,7,8,9,10},
					  {11,12,13,14,15},
					  {16,17,18,19,20},
					  {21,22,23,24,25}};
		// 6. 2차원 배열의 모든 값을 출력하시오. 내림차순으로.
		for (int i = a.length-1; i >= 0; i--) {
			for (int k = a[0].length-1; k >= 0; k--) {
				System.out.print(a[i][k]+" ");
			}
			System.out.println();
		}
		
		// 배열의 모든 값을 출력하기 위해 for문 2개 작성
		// 조건은 오름차순이 아닌 내림차순이므로
		// sysout까지는 변함없지만 for문 속 조건을 역으로 작성
		// 작성 시 초과와 이상, 미만과 이하의 차이를 인지한 뒤 조건 작성 
		
	}

}
