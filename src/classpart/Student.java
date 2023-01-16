package classpart;

public class Student {
	int studentID;			// 학번
	String studentName;		// 학생 이름
	int grade;				// 학년
	String address;			// 사는 곳
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentAnn = new Student();
		studentAnn.setStudentName("안연수");
		
		System.out.println(studentAnn.studentName);
		System.out.println(studentAnn.getStudentName());
	}
}
