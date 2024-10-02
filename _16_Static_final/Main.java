package _16_Static_final;

public class Main {

	public static void main(String[] args) {
	//접근  공용변수 리턴타입 메서드명  매개변수
		
		String name = Thread.currentThread().getName();
		// 스레드가 코드를 실행한다.
		// 현재 코드를 실행하는 스레드의 여러 정보 중
		// 스레드의 이름을 가져와라.
		System.out.println(name+"스레드가 1초뒤에 시작합니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		MemberAdm m = new MemberAdm();
		
		// static 변수는 공용변수. 위치는 Method area.
		// 모든 스레드가 공용해서 사용가능.
		// 즉 변수값 접근 가능
		// 객체를 만들지 않고 클래스명과 변수 또는 메서드 명으로 접근
		String a = MemberAdm.companyName;
		System.out.println(a);
		System.out.println(MemberAdm.companyName);
		MemberAdm.prt();
		MemberAdm.companyName = "Homan";
		System.out.println(MemberAdm.companyName);
		
		MemberAdm m = new MemberAdm();
		
//		m.m = this;
		
		
//		MemberAdm.teamName = "kkk";
		// 상수는 초기값이 결정되면 값을 변경 불가능
		
		// 새로운 스레드를 하나 만들어서 멀티 스레드로 운용이 가능
//		Thread t1 = new Thread();
//		t1.setName("task1_thread");
//		String tname = t1.getName();
//		System.out.println("새로 만든 스레드 이름은 "+tname);
		
		
	}

}
