import java.util.ArrayList;

public class Instructor extends User{
	private String courseGiven;

	public Instructor() {
	}
	

	public String getcourseGiven() {
		return courseGiven;
	}

	public void setcourseGiven(String courseGiven) {
		this.courseGiven = courseGiven;
	}
}
