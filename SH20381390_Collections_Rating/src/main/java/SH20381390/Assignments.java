package SH20381390;

public class Assignments {
	public String student_Name;
	public String subject;
	public String assignment_Category;
	public int points;
	//constructor with feilds
	public Assignments(String student_Name, String subject, String assignment_Category, int points) {
		super();
		this.student_Name = student_Name;
		this.subject = subject;
		this.assignment_Category = assignment_Category;
		this.points = points;
	}
	//getters and setters for all fields
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAssignment_Category() {
		return assignment_Category;
	}
	public void setAssignment_Category(String assignment_Category) {
		this.assignment_Category = assignment_Category;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	//method toString
	@Override
	public String toString() {
		return "Assignments [student_Name=" + student_Name + ", subject=" + subject + ", assignment_Category="
				+ assignment_Category + ", points=" + points + "]";
	}

}
