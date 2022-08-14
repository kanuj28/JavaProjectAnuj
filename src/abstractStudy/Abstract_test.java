package abstractStudy;

public class Abstract_test {

	public static void main(String[] args) {
		//as we can't create object of abstract class
		//creating object of concrete class
		Concrete_Use c=new Concrete_Use();   //object creation
		
	c.test1(); //method completed in Abstract class 
	c.test2();  //method completed in Abstract class
	c.test3();  //method completed in Abstract class
	c.test4();  //method completed in concrete class
	c.test5(); //method completed in concrete class
		
		
	}

}
