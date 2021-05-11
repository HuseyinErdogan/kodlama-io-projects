package nLayeredDemo;
import nLayeredDemo.business.abstracts.UserService;
import nLayeredDemo.business.concretes.UserManager;
import nLayeredDemo.business.concretes.VerificationManager;
import nLayeredDemo.core.concretes.GoogleAuthManagerAdapter;
import nLayeredDemo.dataAccess.abstracts.UserDao;
import nLayeredDemo.dataAccess.concretes.HibernateUserDao;
import nLayeredDemo.entities.concretes.User;
public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = new HibernateUserDao();
		
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleAuthManagerAdapter(), new VerificationManager(userDao));
		
		User user1 = new User(1,"Hüseyin","Erdoðan","huseyinerdoganhe@outlook.com","123456");
		User user2 = new User(2,"Ahmet","Yýlmaz","user2@outlook.com","123456");
		
		userService.signUp(user1);
		userService.signUpWithService(user2);
		userService.signIn("huseyinerdoganhe@outlook.com", "123456");


	}

}
