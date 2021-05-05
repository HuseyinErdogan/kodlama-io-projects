
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course = new Course(1,"Java");
		
		
		Student student = new Student();
		student.setUserID(1);
		student.setName("Hüseyin Erdoğan");
		student.setEmail("student@student.com");
		StudentManager studentManager = new StudentManager();
		studentManager.addUserToCourse(student, course);
		
		
		Instructor instructor = new Instructor();
		instructor.setUserID(2);
		instructor.setName("Ahmet Yılmaz");
		instructor.setEmail("instructor@instructor.com");
		IntstructorManager instructorManager = new IntstructorManager();
		instructorManager.addUserToCourse(student, course);
		
		
		
		
		
	
	}

}
