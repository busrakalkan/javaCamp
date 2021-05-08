package dataAccess.concretes;


import dataAccess.abstracts.UserDao;

public class UserDaoClass implements UserDao{

	@Override
	public void register(String message) {
		System.out.println("Üyelik baþarýyla oluþturuldu " + message);
		
	}

	@Override
	public void login(String message) {
		
		System.out.println("Baþarýyla giriþ yaptý " + message);
	}

	

}
