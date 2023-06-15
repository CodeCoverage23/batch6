package Java8;

public class Student {
	
	int studentId;
	String studentName;
	float studentMarks;
	String Email;
	
	public Student(int studentId, String studentName, float studentMarks, String email) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		Email = email;
	}

	public Student() {
		super();
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentMarks=" + studentMarks
				+ ", Email=" + Email + "]";
	}
	
	
	
	
	

}
