package arryStudy;

public class ArrayEg1 {

	public static void main(String[] args) {
		// i want to store city names
		
		//1. Array declaration
		String city[]=new String[5];
		
		//2. Array initialization
		city[0]="jabalpur";
		city[1]="bhopal";
		city[2]="indore";
		city[3]="delhi";
		city[4]=null;
		//city[5]="akak";
		
		//3. usage
		System.out.println(city[4]);
		//System.out.println(city[19]);
		System.out.println("=========");
		
		//1.Array declaration
		int count[]=new int[3];
		
		//2.initialization
		count[0]=10;
		
		//3.usage
		System.out.println(count[0]);
		System.out.println(count[1]);

	}

}
