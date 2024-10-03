package _16_Static_Final_Test;

import java.util.ArrayList;

public class StudentL {
	// 학생정보는 아이디 이름 전화번호 학년이 있다.
	private String id = null;
	private String name = null;
	private String pNum = null;
	private String grade = null;
	private ArrayList<String> sList = new ArrayList<>();
	
	String getId() {
		return id;
	}
	
	void setId(String id) {
		this.id = id;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getpNum() {
		return pNum;
	}
	
	void setpNum(String pNum) {
		this.pNum = pNum;
	}
	
	String getGrade() {
		return grade;
	}
	
	void setGrade(String grade) {
		this.grade = grade;
	}
	
	String getsList() {
		return sList.toString();
	}
	
	int getsListSize() {
		return sList.size();
	}
	
	void setsName(String sName) {
		sList.add(sName);
	}
	
	
	
	
	
	
	
	
	
}
