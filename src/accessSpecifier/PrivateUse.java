package accessSpecifier;

public class PrivateUse {

	public static void main(String[] args) {
		
		PrivateUse pu=new PrivateUse();  //created object of a class
		pu.test1();//public can be accessed within project
	    pu.test2();//private can be accessed within class
        pu.test3();//default can be accessed within package
	    pu.test4();//proctected can accesse within package, outside of package using inheritance
		
	}
          public void test1()
     {
	System.out.println("public test1 method");//public can be accessed within project
	
    }
          public void test2()
    {
	System.out.println("public test2 method");//private can be accessed within class
   }
          void test3()
     {
	System.out.println("default test3 method");//default can be accessed within package
    }
          protected void test4()
   {
	System.out.println("protected test4 method");//proctected can be accessed within package, outside of package with inheritance 
   }
}
