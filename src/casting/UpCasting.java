package casting;

public class UpCasting {

	public static void main(String[] args) {
		Father f=new Father();
		Son s=new Son();
		
		s.bike();
		s.car();
		s.degree();
		System.out.println("==============");
		
		Father f1=new Son();
		f1.bike();
		f1.car();
		
	
		

	}

}
