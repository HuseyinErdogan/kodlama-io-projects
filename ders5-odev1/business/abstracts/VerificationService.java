package nLayeredDemo.business.abstracts;

import nLayeredDemo.entities.concretes.User;

public interface VerificationService {
	
	boolean isPasswordValid(String password);
	boolean isEMailValid(String eMail);
	boolean isNameValid(String firstName, String lastName);
	boolean isEMailReceived(String eMail);
	boolean isMailAndPasswordMatched(String eMail, String password);
	boolean isClickedVerificationLink(User user);
	
}
