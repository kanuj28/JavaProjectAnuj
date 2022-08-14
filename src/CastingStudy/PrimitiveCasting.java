package CastingStudy;

public class PrimitiveCasting {

	public static void main(String[] args) {
		int a=5; 
		System.out.println(a);
		
		 double b= a;//converted to higher data type info--implicit casting or widening
		System.out.println(b);
		
		double c=10.5; //higher data type
		System.out.println(c);
		
		int d=(int) c; //converted to lower data type info--explicit casting or narrowing 
		System.out.println(d);

	}

}
