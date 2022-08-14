package methods;

public class NonStaticMethodCall {

	public static void main(String[] args) 
	{
		//classname objectname=new classname():
		
		NonStaticMethodCall n=new NonStaticMethodCall();// created object of a class
		//to call non static methods from same class
		// objectname.methodname()
		;
		
		n.test();//calling non static method from same class

		//calling non static method of another-->need to create object of that class
		
		MyClass m=new MyClass();// created object of myClass
		//to call non static method-->objectname.methodName();
		m.myMethod();//calling non static method from another class
	}
	
	public void test()// non static regular method
	{
		System.out.println("This is test method");
	}

}
