package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import core.abstracts.EmailService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	//Database simulasyonu için
	private String email;
	private String password;
	
	private UserDao userDao;
	private EmailService emailService;

	public UserManager(UserDao userDao,EmailService emailService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
	}


	@Override
	public void register(User user) {
		
		boolean check = checkRegister(user);
		
		// ToDo: Doğrulama maili gönder!!
		
		if(check==true) {
			this.emailService.sendMail(user.getEmail());
			this.userDao.register(user.getFistName());
		
			this.email=user.getEmail();
			this.password=user.getPassword();
		}else {
			System.out.println("Girilen bilgiler geçerli değil");
		}
		
	}
	

	@Override
	public void login(String email, String password) {
		
		if(this.email==email && this.password==password) {
			this.userDao.login(email);
		}else {
			System.out.println("Mail hesabı veya parola yanlış");
		}
		
		
	}
	
	public boolean checkRegister(User user) {
		String emailRegex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat= Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher= emailPat.matcher(user.getEmail());
		
		if(matcher.find() && user.getPassword().length()>=6 && 
				user.getFistName().length()>=2 && user.getLastName().length()>=2) {
			return true;
		}else {
			return false;
		}
	}


}
