package classpart;

public class Student {
	int studentID;			// �й�
	String studentName;		// �л� �̸�
	int grade;				// �г�
	String address;			// ��� ��
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		Student studentAnn = new Student();
		studentAnn.setStudentName("�ȿ���");
		
		System.out.println(studentAnn.studentName);
		System.out.println(studentAnn.getStudentName());
	}
}
