package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.UserService;
import nLayeredDemo.business.abstracts.VerificationService;
import nLayeredDemo.core.abstracts.SignUpService;
import nLayeredDemo.dataAccess.abstracts.UserDao;
import nLayeredDemo.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private SignUpService signUpService;
	private VerificationService verificationService;
	
	public UserManager(UserDao userDao, SignUpService signUpService, VerificationService verificationService) {
		super();
		this.userDao = userDao;
		this.signUpService = signUpService;
		this.verificationService = verificationService;
	}

	@Override
	public void add(User user) {
		
		this.userDao.add(user);
		
	}

	@Override
	public void delete(User user) {
		
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		
		this.userDao.update(user);
		
	}

	@Override
	public User get(int id) {
		
		return this.userDao.get(id);
		
	}

	@Override
	public List<User> getAll() {
		
		return this.userDao.getAll();
	}

	@Override
	public void signUp(User user) {
		
		if(!verificationService.isNameValid(user.getFirstName(), user.getLastName()))
			System.out.println("Name is invalid. Name must be at least 6 characters.");
		else if(!verificationService.isEMailValid(user.geteMail()))
			System.out.println("E-Mail is not valid.");
		else if(!verificationService.isEMailReceived(user.geteMail()))
			System.out.println("E-Mail: "+user.geteMail()+" is already received.");
		else if(!verificationService.isPasswordValid(user.getPassword()))
			System.out.println("Password is invalid. Password must be at least 6 characters.");	
		else {
			System.out.println("Sign up process is successful! Verification mail sended to "+user.geteMail());
			this.userDao.add(user);
		}
	
	}

	@Override
	public void signIn(String eMail, String password) {
		if(this.verificationService.isMailAndPasswordMatched(eMail, password))
			System.out.println("Sign in process is successful!");
		else
			System.out.println("Your email or password is incorrect");
		
	}
	
	@Override
	public void signUpWithService(User user) {
		this.signUpService.signUp(user);
		System.out.println("Sign up process is successful! Verification mail sended to "+user.geteMail());
	}

	@Override
	public void eMailVerification(User user) {
		System.out.println("Verification is successful!");
		
	}
	
	

}
