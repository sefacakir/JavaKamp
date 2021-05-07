package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		
		UserManager manager = new UserManager();
		manager.add(new Student());
		manager.add(new Instructor());

	}
}
