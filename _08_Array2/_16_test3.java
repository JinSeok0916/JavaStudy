package _08_Array2;

public class _16_test3 {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},
					  {6,7,8,9,10},
					  {11,12,13,14,15},
					  {16,17,18,19,20},
					  {21,22,23,24,25}};
		int [][] d = {{1,2,3,4,5,6},
					  {7,8,9,10,11,12},
					  {13,14,15,16,17,18},
					  {19,20,21,22,23,24},
					  {25,26,27,28,29,30},
					  {31,32,33,34,35,36}};
		
		// 시작점 및 이전값 저장을 위한 변수 2개
		int aTemp = 0;
		int bTemp = 0;
		// 열의 최소값을 저장하기 위한 변수
		int maxRow = a.length-1;
		// 열의 최대값을 저장하기 위한 변수
		int maxCol = a[0].length-1;
		// 행의 최소값을 저장하기 위한 변수
		int minRow = 0;
		// 열의 최소값을 저장하기 위한 변수
		int minCol = 0;
		
		// round = 회전 수
		for (int round = 0; round < a.length/2; round++) {
			// bTemp = 첫 시작점. 매 바퀴마다 한칸씩 가운데로 이동
			bTemp = a[round][round];
			// 행이 매 바퀴마다 위쪽 행일 경우 값을 치환하는 식 
			for (int j = round; j < a[0].length-1-round; j++) {
				aTemp = a[minRow][j+1];
				a[minRow][j+1] = bTemp;
				bTemp = aTemp;
			}
			// 행이 매 바퀴마다 오른쪽 행일 경우 값을 치환하는 식
			for (int i = round; i < a.length-1-round; i++) {
				aTemp = a[i+1][maxCol];
				a[i+1][maxCol] = bTemp;
				bTemp = aTemp;
			}
			// 행이 매 바퀴마다 아랫쪽 행일 경우 값을 치환하는 식
			for (int j = a[0].length-round-1; j >= round+1; j--) {
				aTemp = a[maxRow][j-1];
				a[maxRow][j-1] = bTemp;
				bTemp = aTemp;
			}
			// 행이 매 바퀴마다 왼쪽 행일 경우 값을 치환하는 식
			for (int i = a.length-round-1; i >= round+1; i--) {
				aTemp = a[i-1][minCol];
				a[i-1][minCol] = bTemp;
				bTemp = aTemp;
			}
			// 한바퀴를 돌았다면 다음 바퀴 때의 초기값을 바꾸기 위한 식
			minRow++;
			minCol++;
			maxRow--;
			maxCol--;
		}
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
