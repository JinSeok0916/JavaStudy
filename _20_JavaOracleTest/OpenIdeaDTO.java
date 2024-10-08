package _20_JavaOracleTest;

public class OpenIdeaDTO {
	private String num = null;
	private String title = null;
	private String explain = null;
	private String name = null;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
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
