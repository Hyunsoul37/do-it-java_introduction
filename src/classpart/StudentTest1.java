package classpart;

public class StudentTest1 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentName("안연수");
		
		Student student2 = new Student();
		student2.setStudentName("안승연");
		
		System.out.println(student1.getStudentName());
		
		System.out.println(student2.getStudentName());
	}

}
