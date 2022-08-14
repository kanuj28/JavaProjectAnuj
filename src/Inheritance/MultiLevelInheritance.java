package Inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
		Son s=new Son(); //created object of son class
		
		s.receipe(); //using sons object calling grandmothers method
		s.nature(); //using sons object calling mothers method
		s.mobile(); //using sons object calling sons own method
		
		//to call static method
		
		Son.stories(); //using sons class calling grandmothers static method
		Son.look(); //using sons class calling mothers static method
		Son.laptop();//using sons calss calling sons own static method
		
		Mother m=new Mother();
		m.receipe();
		m.nature();
	}

}
