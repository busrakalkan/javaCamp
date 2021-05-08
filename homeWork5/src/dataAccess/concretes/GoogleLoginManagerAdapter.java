package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import homeWork5.GoogleLoginManager;

public class GoogleLoginManagerAdapter implements UserDao{
	
	GoogleLoginManager googleManager = new GoogleLoginManager();

	@Override
	public void login(String message) {
		googleManager.login(message);
		
	}

	@Override
	public void register(String message) {
		googleManager.register(message);
		
	}

}
