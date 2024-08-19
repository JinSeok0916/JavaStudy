package _05_2For;

public class _00_Test {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("1*"+i+"="+(1*i));
		}
		
		for (int dan = 1; dan < 5; dan++) {
			System.out.println(dan);
			for (int i = 0; i < 5; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
			
		}
		
		for (int i = 0; i < 4; i ++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		String id = "abc*";
		String sign = "*^$";
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < 3; k++) {
				if (id.charAt(i) == sign.charAt(k)) {
					System.out.println("id에 특수문자가 있습니다.");
				}
			}
		}
		
	}

}
