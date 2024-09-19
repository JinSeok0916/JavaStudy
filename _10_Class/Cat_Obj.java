package _10_Class;

// 한마리 고양이에 대한 단일 책임의 클래스 정의
public class Cat_Obj {

	String name = null;
	int age = 0;
	
	public void prt() {
		System.out.println("--- cat info ---");
		System.out.println(name);
		System.out.println(age);
	}
	
}
