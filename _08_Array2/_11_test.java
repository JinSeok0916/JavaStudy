package _08_Array2;

public class _11_test {

	public static void main(String[] args) {
		int [][] a = new int [4][5];
		int num = 1;
		
		for (int j = a[0].length - 1; j >= 0; j--) {
			for (int i = 0; i < a.length; i++) {
				a[i][j] = num;
				num++;
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
