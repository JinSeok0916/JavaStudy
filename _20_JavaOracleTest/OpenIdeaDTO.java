package _20_JavaOracleTest;

public class OpenIdeaDTO {
	private int num = 0;
	private String title = null;
	private String explain = null;
	private String name = null;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "OpenIdeaDTO [num=" + num + ", title=" + title + ", explain=" + explain + ", name=" + name + "]";
	}
	
}
