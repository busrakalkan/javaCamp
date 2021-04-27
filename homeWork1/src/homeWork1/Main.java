package homeWork1;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý(C# & Angular)", "Engin Demiroð", "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");
		Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý(Java & React)", "Engin Demiroð", "2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");
		Course course3 = new Course(3,"Yazýlým Geliþtirici Yetiþtirme Kampý(Java & React)", "Engin Demiroð", "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.");

		Course[] courses = {course1, course2, course3};
		CourseManager courseManager = new CourseManager();
		
		for (Course course : courses) {
			courseManager.printCourse(course);
		}
		
		User user1 = new User(1,"Büþra","Kalkan","123");
		User user2 = new User(2,"Can","Kalkan","321");
		
		UserManager userManager=new UserManager();
		
		userManager.addUser(user1);
		userManager.addUser(user2);
		
		userManager.deleteUser(user1);

	}

}
