package _08_Array2;

public class _16_test {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4,5},
					  {6,7,8,9,10},
					  {11,12,13,14,15},
					  {16,17,18,19,20},
					  {21,22,23,24,25}};
		int [][] c = {{1,2,3,4,5,6},
					  {7,8,9,10,11,12},
					  {13,14,15,16,17,18},
					  {19,20,21,22,23,24},
					  {25,26,27,28,29,30},
					  {31,32,33,34,35,36}};
		int [][] b = new int [5][5];
		// 
		for (int round = 0; round < a.length; round++) {
			for (int i = round; i < a.length; i++) {
				for (int j = round; j < a[0].length; j++) {
					if (i == round && j < a[0].length-(round+1)) {
//						System.out.println(i+" "+(j)+" "+a[i][j]);
						b[i][j+1] = a[i][j];
					}
					else if (i < a.length-(round+1) && j == a[0].length - (round+1)) {
						b[i+1][j] = a[i][j];
					}
				}
			}
			for (int i = a.length-1-round; i >= round; i--) {
				for (int j = a[0].length-1-round; j >= round; j--) {
					if (i == a.length-(round+1) && j > round) {
						b[i][j-1] = a[i][j];
					}
					else if (i > round && j == round) {
						b[i-1][j] = a[i][j];
					}
				}
			}
			if (b[a.length/2][a[0].length/2] == 0)
				b[a.length/2][a[0].length/2] = a.length*a[0].length/2+1;
		}
		
		
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
