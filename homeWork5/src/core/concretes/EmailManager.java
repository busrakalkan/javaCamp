package core.concretes;

import core.abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void sendMail(String email) {
		System.out.println(email + " adresine doðrulama linki gönderildi.");
		
	}

}
