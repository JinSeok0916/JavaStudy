package _08_Array2;

public class _04_test {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},
					  {6,7,8,9,10},
					  {11,12,13,14,15},
					  {16,17,18,19,20},
					  {21,22,23,24,25}};
		// 4. 전체 배열의 값 중 짝수는 모두 몇 개인가?
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[0].length; k++) {
				if (a[i][k] % 2 == 0)
					cnt++;
			}
		}
		System.out.println(cnt);
		
		// 전체 배열을 찾기 위해 for문 2개 작성
		// 전체 배열의 value값이 짝수인 조건이므로 a[i][k]를 2로 나눈 값이 0이어야함
		// 짝수의 갯수를 구하기 위해 변수 cnt를 생성한 뒤 짝수일 때 마다 cnt값을 1씩 증가
		// 2개의 for문을 다 돌아 모든 배열의 value값을 확인한 뒤 증가한 cnt값을 출력 
		
	}

}
