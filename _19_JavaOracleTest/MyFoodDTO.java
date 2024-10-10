package _19_JavaOracleTest;

public class MyFoodDTO {
	
	// 내가 좋아하는 음식
	private String foodType = null;
	private String foodName = null;
	private String foodTaste = null;
	private String foodMain = null;
	
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodTaste() {
		return foodTaste;
	}
	public void setFoodTaste(String foodTaste) {
		this.foodTaste = foodTaste;
	}
	public String getFoodMain() {
		return foodMain;
	}
	public void setFoodMain(String foodMain) {
		this.foodMain = foodMain;
	}
	@Override
	public String toString() {
		return "MyFoodDTO [foodType=" + foodType + ", foodName=" + foodName + ", foodTaste=" + foodTaste + ", foodMain="
				+ foodMain + "]";
	}
}
