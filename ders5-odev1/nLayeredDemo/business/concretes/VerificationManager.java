package nLayeredDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayeredDemo.business.abstracts.VerificationService;
import nLayeredDemo.dataAccess.abstracts.UserDao;
import nLayeredDemo.entities.concretes.User;

public class VerificationManager implements VerificationService{
	
	private UserDao userDao;
	
	public VerificationManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public boolean isPasswordValid(String password) {		
		return password.length()>=6;
	}

	@Override
	public boolean isEMailValid(String eMail) {
		
		String regex = "^(.+)@(.+)$";
		 
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(eMail);
		
		if(matcher.matches())	
			return true;
			
		
		return false;
	}

	@Override
	public boolean isNameValid(String firstName, String lastName) {
		
		if (firstName.length()<2 || lastName.length()<2)
			return false;
		
		return true;
	}

	@Override
	public boolean isEMailReceived(String eMail) {
		
		for(User user:this.userDao.getAll()) {
			if(user.geteMail().equals(eMail)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isMailAndPasswordMatched(String eMail, String password) {
		for(User user:this.userDao.getAll()) {
			if(user.geteMail().equals(eMail)&&user.getPassword().equals(password))
				return true;
		}
		return false;
	}

	@Override
	public boolean isClickedVerificationLink(User user) {
			// VERIFICATION PROCESS
		return true;
	}

}
