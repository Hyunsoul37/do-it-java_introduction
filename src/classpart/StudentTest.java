package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAnn = new Student();
		studentAnn.setStudentName("¾È¿¬¼ö");
		
		System.out.println(studentAnn.studentName);
		System.out.println(studentAnn.getStudentName());
	}

}
