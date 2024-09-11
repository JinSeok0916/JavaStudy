package _08_Array2;

public class _16_test {

	public static void main(String[] args) {
		int [][] a = new int [4][5];
		int num = 1;
		
		int y = 0;
		for (int x = 0; x < a.length+a[0].length; x++) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					if (i + j == num  - 1) {
						a[i][j] = num;
						num++;
					}
				}
			} 
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
