
public class IntstructorManager extends UserManager{
	@Override
	public void addUserToCourse(User user, Course course) {
		// TODO Auto-generated method stub
		
		System.out.println("Instructor "+user.getName()+ " has joined the "+course.getCourseName()+".");
		
	}
}
