package variableTypes;

import methods.Sample;

public class GlobalAndLocalVariable {
int a=90; //non-static global variable
static int b=10; //static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GlobalAndLocalVariable g=new GlobalAndLocalVariable();
g.test();
g.test1();
System.out.println("global value of a is "+g.a); //calling non-static global variable from same class
System.out.println("global value of b is "+b); //calling static global variable from same class

int sum=10+g.a; // usage of non static global variable from same class
int sub=100-b; // usage of static global variable from same class

      //calling non static global variable from another class
      //need to create object of another class(sample class)

     Sample s=new Sample(); //created object of another class
     System.out.println("value of non-static global variable from another class is "+s);
     
     //calling static global variable from another class
     System.out.println("value of static global variable from another class is ");
    

		
		
		
	}
public void test()
{
	int a=80;
	int sum=a+100;
	System.out.println("sum is "+sum);
	
}
public void test1()
{
	int a=1000;  //static int b=800;
	System.out.println("Running static test1 method");
}
}
