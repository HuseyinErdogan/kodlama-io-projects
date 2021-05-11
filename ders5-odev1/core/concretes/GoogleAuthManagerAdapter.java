package nLayeredDemo.core.concretes;

import nLayeredDemo.entities.concretes.User;
import nLayeredDemo.googleAuth.GoogleAuthManager;
import nLayeredDemo.core.abstracts.SignUpService;

public class GoogleAuthManagerAdapter implements SignUpService{
	

	@Override
	public void signUp(User user) {
		
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.signUp(user);
		
	}

	

}
