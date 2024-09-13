package _08_Array2;

public class _16_test2 {

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
		
		// 덮어씌워지기 전 값을 저장하기 위한 변수 aTemp
		int aTemp = 0;
		
		// 행의 마지막 인덱스를 저장할 변수
		int endRow = a.length-1;
		
		// 열의 마지막 인덱스를 저장할 변수
		int endCol = a[0].length-1;
		
		// 몇바퀴인지 체크하기 위한 round 변수
		for (int round = 0; round < a.length; round++) {
			
			// 시작값 및 또 다른 저장을 위한 변수 bTemp. 첫 바퀴는 0,0 시작이고 두번째는 1,1시작이 반복되므로 bTemp = a[round][round] 
			int bTemp = a[round][round];
			
			// 행을 고르기 위한 변수 i와 for문. round바퀴마다 시작하는 행이 round와 같이 커져야하므로 i = round
			for (int i = round; i < a.length; i++) {
				
				// 열을 고르기 위한 변수j와 for문. round바퀴마다 시작하는 열이 round와 같이 커져야하므로 j = round
				for (int j = round; j < a[0].length; j++) {
					
					// 행 i가 해당 round바퀴의 시작점일 경우 및 열 j가 마지막 인덱스보다 작을경우 + 매 바퀴마다 한칸씩 안으로 들어가야함
					if (i == round && j < endCol-round) {
						aTemp = a[i][j+1];
						a[i][j+1] = bTemp;
						bTemp = aTemp;
					}
					// 행 i는 최소값이 round라서 한바퀴 돌 때마다 최소값이 1씩 증가하므로 안으로 한칸씩 들어가는 조건을 갖추고 있고
					// 바꾸려는 값은 
					else if (i < endRow-round && j == endCol-round) {
						aTemp = a[i+1][j];
						a[i+1][j] = bTemp;
						bTemp = aTemp;
					}
				}
			}
			for (int i = endRow-round; i >= round; i--) {
				for (int j = endCol-round; j >= round; j--) {
					if (i == endRow-1-round && j > round) {
						aTemp = a[i][j-1];
						a[i][j-1] = bTemp;
						bTemp = aTemp;
					}
					else if (i > round && j == round) {
						aTemp = a[i-1][j];
						a[i-1][j] = bTemp;
						bTemp = aTemp;
					}
				}
			}
			if (a[a.length/2][a[0].length/2] == 0)
				a[a.length/2][a[0].length/2] = a[a.length/2][a[0].length/2];
		}
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
