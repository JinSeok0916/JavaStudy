package _15_접근제어자_02;

public class MemberOne {
	String name = null;
	
	public void prt() {
		System.out.println(name);
	}
	
	public void setName(String n) {
		if(chkName(n))
			this.name = n;
		else
			this.name = "err";
	}
	
	private boolean chkName(String n) {
		if (n.charAt(0) == '4')
			return false;
		return true;
	}
	
	// chkName 은 내부적으로 호출하는 메서드로 정의하였으므로 private가 적당함.
	
}
