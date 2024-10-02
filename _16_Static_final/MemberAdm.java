package _16_Static_final;

public class MemberAdm {

	public final String name = null;
	public static String companyName = "Human";
	public static final String teamName = "kimTeam";
	Main m = null;
	
	static String tN = teamName;
	String teamName1 = tN;
	
	MemberAdm () {
		String name = Thread.currentThread().getName();
		System.out.println(name+"스레드가 MemberAdm"+"생성자 실행");
	}
	
	public static void prt() {
//		System.out.println(name);
		
	}
	
}
