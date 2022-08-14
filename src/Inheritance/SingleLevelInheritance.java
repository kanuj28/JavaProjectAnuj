package Inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args)
	{
		Mother m=new Mother(); //created object of mother class
		Son s=new Son(); //created object of son class
		
		m.nature(); //using mothers object calling mothers method
		s.mobile();//using sons object calling sons methods
		s.nature(); //using sons object calling mothers method
		
		Mother.look(); //mother calling its own methods
		Son.laptop(); //son calling its own static method
		Son.stories(); // son calling 
        
        
        //try to call static and non static variables
	}

}
