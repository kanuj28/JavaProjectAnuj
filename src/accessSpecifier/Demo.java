package accessSpecifier;

public class Demo {

	public static void main(String[] args) {
		
		PrivateUse p=new PrivateUse(); //created ojbect of another class
		p.test1(); //calling public test1 method
		//p.test2(); //private method can be called only within class
		p.test3();//default methods can be accessed within package
        p.test4();////proctected can be accessed within package, outside of package and outside of package with inheritance
	}

}
