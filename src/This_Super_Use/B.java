package This_Super_Use;

public class B extends A
{
	int a=100; //global variable

	public static void main(String[] args) {
		B b=new B();
		b.display();

	}
     public void display()
     {
    	 int a=200;//local variable
    	 System.out.println("local variable of a is "+a);//calling local value
    	 System.out.println("global value of a from same class "+this.a);//calling global value from same class
    	 System.out.println("global value of a from super class "+super.a);
     }
}
