package Group9;

public class StaticMethod9 {

	public static void main(String[] args) {
		// calling static method
		add();
		MethoddiffClass.div(); //calling static method from another class
	}
	public static void add()
	{
		String name;
		String course;
		int a;
		int b;
		int c;
	
		name="Anuj";
		course="Testing";
		
		a=65;
		
		b=45;
		c=a+b;
		System.out.println("my name is "+name);
		System.out.println("add is "+c);
		System.out.println("course name is " +course);
	}

}
