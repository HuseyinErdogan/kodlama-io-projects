package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	User get(int id);
	List<User> getAll();
	void signUp(User user);
	void signIn(String eMail, String password);
	void signUpWithService(User user);
	void eMailVerification(User user);
	
}
