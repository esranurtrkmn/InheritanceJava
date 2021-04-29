package kodlamaioProject;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();
		
		Instructor instructor1=new Instructor();
		
		
		student1.setId(1);
		student1.setFirstName("Esranur");
		student1.setLastName("Türkmen");
		student1.seteMail("turkmenesranur@gmail.com");
		student1.setStudentNo(327);
	
		
		
		instructor1.setId(2);
		instructor1.setFirstName("Engin");
        instructor1.setLastName("Demiroğ");
        instructor1.seteMail("engindemirog@gmail.com");
        instructor1.setSalary(100000);
		
        
    	
		Student[] students= new Student[]{student1};
		
		for(Student student: students) {
			System.out.println("öğrencinin adı:"+student.getFirstName());
			System.out.println("öğrencinin soyadı:"+student.getLastName());
			System.out.println("öğrencinin mail adresi:"+student.geteMail());
			System.out.println("öğrencinin numarası:"+student.getStudentNo());
		}
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.Add(student1);
		studentManager.List();
		
		
		
        
        Instructor[] instructors=new Instructor[]{instructor1};
        
        for(Instructor instructor:instructors) {
        	System.out.println("\nöğretmenin adı:"+instructor.getFirstName());
        	System.out.println("öğretmenin soyadı:"+instructor.getLastName());
        	System.out.println("öğretmenin mail adresi:"+instructor.geteMail());
        	System.out.println("öğretmenin maaşı:"+instructor.getSalary());
        	
        }
        
        InstructorManagement instructorManager=new InstructorManagement();
        
        instructorManager.Add(instructor1);
        instructorManager.List();
		
       
        
	
		
		
	}

}
