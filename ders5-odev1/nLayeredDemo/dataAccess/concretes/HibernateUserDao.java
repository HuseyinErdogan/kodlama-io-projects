package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.UserDao;
import nLayeredDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		
		System.out.println("User: "+user.getFirstName()+" has been added with hibernate");
		
	}

	@Override
	public void delete(User user) {

		System.out.println("User: "+user.getFirstName()+" has been deleted with hibernate");
		
	}

	@Override
	public void update(User user) {
		
		System.out.println("User: "+user.getFirstName()+" has been updated with hibernate");
		
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
