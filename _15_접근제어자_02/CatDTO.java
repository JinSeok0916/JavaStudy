package _15_접근제어자_02;

public class CatDTO {

	private String name = null;
	private int age = 1;
	// 멤버변수는 접근제어자로 은닉화시킨다.
	// 은닉화 시키면 CatDTO 클래스 외부에서 변수에 참조를 하려면
	// 메서드를 통해야만 하게 할 수 있다.
	// 저장하는 메서드를 setter, 인출하는 메서드를 getter 라고 한다.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		chkName(name);
		this.name = name;
	}
	private void chkName(String name2) {
		// TODO Auto-generated method stub
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
