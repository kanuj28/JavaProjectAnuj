package methods;

public class MethodStudy {

	public static void main(String[] args) 
	{
	      test2();// calling static regular method from same class
	      Sample.display();//calling static regular method from another class

	}
          //public static void test();//static regular method--incomplete method--method don't have body
	      //public void test1()//non-static regular--incomplete--method don't have body

	public static void test2()//static regular method--complete method--method have body
	{
		  System.out.println("Hi i am test2 static regular method");
	}
}
