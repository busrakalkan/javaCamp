package dataAccess.concretes;


import dataAccess.abstracts.UserDao;

public class UserDaoClass implements UserDao{

	@Override
	public void register(String message) {
		System.out.println("�yelik ba�ar�yla olu�turuldu " + message);
		
	}

	@Override
	public void login(String message) {
		
		System.out.println("Ba�ar�yla giri� yapt� " + message);
	}

	

}
