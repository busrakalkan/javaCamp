package homeWork1;

public class UserManager {
	
	public void addUser(User user) {
		
		System.out.println(user.name+" "+user.surname+" isimli kullanýcý eklendi.");
	}
	public void deleteUser(User user) {
		
		System.out.println(user.name+" "+user.surname+" isimli kullanýcý silindi.");
	}

}
