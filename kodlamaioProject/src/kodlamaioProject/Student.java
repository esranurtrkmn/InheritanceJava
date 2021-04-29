package kodlamaioProject;

public class Student extends User{

	int studentNo;
	
	public Student(){
		
	}

	public Student(int id, String firstName, String lastName, String eMail, int studentNo) {
		super(id, firstName, lastName, eMail);
		this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	
}
