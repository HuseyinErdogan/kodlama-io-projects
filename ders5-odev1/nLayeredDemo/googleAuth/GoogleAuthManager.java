package nLayeredDemo.googleAuth;

import nLayeredDemo.entities.concretes.User;

public class GoogleAuthManager {
	
	public void signUp(User user) {
		System.out.println("User: "+user.getFirstName()+"signed up with Google.");
	}
	public void signIn(User user) {
		System.out.println("User: "+user.getFirstName()+"signed in with Google.");
	}
	
}
