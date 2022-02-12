package week3.day1;

public class Students {

	public void getStudentInfo(int id, String name) {
		System.out.println("Id of the student is: " + id);
		System.out.println("Name of the student is: " + name);
	}

	public void getStudentInfo(String email, int phoneNumber) {
		System.out.println("Email Id of the student is: " + email);
		System.out.println("Phone Number of the student is: " + phoneNumber);
	}

	public static void main(String[] args) {
		Students s = new Students();
		String name = "Karthika";
		String email = "kdks420@gmail.com";
		s.getStudentInfo(07, name);
		s.getStudentInfo(email, 984012276);

	}
}
