package _08_Array2;

public class _13_test {

	public static void main(String[] args) {
		int [][] a = new int [4][5];
		int num = 1;
//		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[0].length; j++) {
//				if (i % 2 == 0) {
//					a[i][j] = num;
//					num++;
//				}
//				if (i % 2 == 1) {
//					a[i][a[0].length-1-j] = num;
//					num++;
//				}
//			}
//		}
//		
		for (int i = 0; i < a.length; i+=2) {
			for (int j = 0; j < a[0].length; j++) {
					a[i][j] = num;
					num++;
			} num += a[0].length;
		}
		num -= a.length-1*a[0].length;
		for (int i = 1; i < a.length; i+=2) {
			for (int j = 0; j < a[0].length; j++) {
					a[i][a[0].length-1-j] = num;
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
