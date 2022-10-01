package SH20381390;

public class Distributions {
	private String Assignment_Category;
	private int Weight;
	//constructor
	public Distributions(String assignment_Category, int weight) {
		super();
		Assignment_Category = assignment_Category;
		Weight = weight;
	}
	//getters and setters
	public String getAssignment_Category() {
		return Assignment_Category;
	}
	public void setAssignment_Category(String assignment_Category) {
		Assignment_Category = assignment_Category;
	}
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int weight) {
		Weight = weight;
	}
	//toString
	@Override
	public String toString() {
		return "Distributions [Assignment_Category=" + Assignment_Category + ", Weight=" + Weight + "]";
	}
	

}
