package casting;

public class UpCastingStudy {

	public static void main(String[] args) {
		Student s=new Student();
		s.Sports();
		s.Teaching();
		s.learn();
		
		System.out.println("=============");
		
		Teacher t1=new Student();
		t1.Sports();
		t1.Teaching();
		
		
		
		
		

	}

}
