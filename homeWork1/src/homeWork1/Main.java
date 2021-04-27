package homeWork1;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# & Angular)", "Engin Demiro�", "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
		Course course2 = new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(Java & React)", "Engin Demiro�", "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
		Course course3 = new Course(3,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(Java & React)", "Engin Demiro�", "PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.");

		Course[] courses = {course1, course2, course3};
		CourseManager courseManager = new CourseManager();
		
		for (Course course : courses) {
			courseManager.printCourse(course);
		}
		
		User user1 = new User(1,"B��ra","Kalkan","123");
		User user2 = new User(2,"Can","Kalkan","321");
		
		UserManager userManager=new UserManager();
		
		userManager.addUser(user1);
		userManager.addUser(user2);
		
		userManager.deleteUser(user1);

	}

}
