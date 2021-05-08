package homeWork5;

import business.abstracts.UserService;
import business.concretes.UserManager;
import core.concretes.EmailManager;
import dataAccess.concretes.GoogleLoginManagerAdapter;
import dataAccess.concretes.UserDaoClass;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new UserDaoClass(), new EmailManager());
		User user = new User(1,"büþra","kalkan","123456","abc@gmail.com");
		
		userService.register(user);
		
		userService.login(user.getEmail(),user.getPassword());
		
		
		UserService userService2 = new UserManager(new GoogleLoginManagerAdapter(), new EmailManager());
		User user2 = new User(2,"can","kalkan","654321","cba@gmail.com");
		
		userService2.register(user2);
		userService2.login(user2.getEmail(),user2.getPassword());
		
		
	}

}
