package methods;

public class MathOperations {

	public static void main(String[] args) 
	{
		MathOperations m=new MathOperations();// created object of a class 
	    m.add(5,15);//calling non-static method with the help of object
		sub();//calling method
		
	}
public void add(int i, int j)// non static method
{
	int a;
	int b;
	int addition;
	a=10;
	b=20;
	addition=a+b;
System.out.println("addition is "+addition);

}
    public static void sub()//static regular method
{
	int a;
	int b;
	int subs;
	a=0;
	b=10;
	subs=a-b;
	System.out.println("sub is "+subs);
}  
}
 




