package homeWork1;

public class UserManager {
	
	public void addUser(User user) {
		
		System.out.println(user.name+" "+user.surname+" isimli kullan�c� eklendi.");
	}
	public void deleteUser(User user) {
		
		System.out.println(user.name+" "+user.surname+" isimli kullan�c� silindi.");
	}

}
