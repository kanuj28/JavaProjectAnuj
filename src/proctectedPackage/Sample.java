package proctectedPackage;

import accessSpecifier.PrivateUse;

public class Sample extends PrivateUse 
 
{
	public static void main(String[] args) {
		PrivateUse p=new PrivateUse();
		p.test1(); //we can call only public methods in another package
		//to call protected methods we need to create object of subclass
		Sample s=new Sample();
		
		s.test1();//calling super class public method using subclass method
		s.test4();//calling super class protected method using subclass method

		
	}

}
