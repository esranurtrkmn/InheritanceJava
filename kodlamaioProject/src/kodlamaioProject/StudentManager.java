package kodlamaioProject;

public class StudentManager extends UserManagement {

	@Override
	public void List() {
		
		System.out.println("Öğrenciler listelendi");
	}
	
	@Override
	public void Add(User user) {
		
		System.out.println(user.getFirstName()+" eklendi");
	}
}
