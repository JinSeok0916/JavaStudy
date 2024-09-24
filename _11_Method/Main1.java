package _11_Method;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TestMethod t = new TestMethod();
//		System.out.println(t.name);
//		t.setName(in.nextLine());
//		System.out.println(t.name);
//		String resultName = t.getName2(in.nextLine());
//		if (resultName != null)
//			System.out.println(resultName);
//		else
//			System.out.println("비번틀림");
		String maskName = t.maskName("ng");
		System.out.println(maskName);
	}

}
