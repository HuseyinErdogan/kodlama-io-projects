
public class StudentManager extends UserManager{
	@Override
public void addUserToCourse(User user, Course course) {
	// TODO Auto-generated method stub
	System.out.println("Student "+user.getName()+ " has joined the "+course.getCourseName()+".");
		
}
	

}
