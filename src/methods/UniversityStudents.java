package methods;

public class UniversityStudents {

	public static void main(String[] args) {
		
         UniversityStudents us=new UniversityStudents();// created object of a class
         us.studentInfo();// calling non-static method from same class
         us.studentInfo("Katraj","PU765432","Arts","test", 'M',2020,99.99f);
         us.studentInfo("pune","PU98088","MSC COMP","MSC COMP", 'M',2021,88.09f);
         
	}
//name,PRN,branch,dept,gender,passoutyear,weight
	
	public void studentInfo()// method without parameter
	{
		String name;
		name="velocity";
		
		String PRN;
		PRN="PU12144";
				
	    String branch;
		branch="Engg";
		
		String dept;
		dept="MECH";
		
		char gender;
		gender='F';
		
		int passoutyear;
		passoutyear=2019;
		
		float weight;
		weight=78.88f;
		
		System.out.println("=====================");
		System.out.println("my name is "+name);
		System.out.println("my PRN number is "+PRN);
		System.out.println("my branch is "+branch);
		System.out.println("my dept is "+dept);
		System.out.println("my gender is "+gender);
		System.out.println("my passout year is "+passoutyear);
		System.out.println("my weight is "+weight);
		System.out.println("=====================");
	}
	
     //name,PRN,branch,dept,gender,passoutyear,weight
	
	public void studentInfo(String name,String PRN,String branch,String dept,char gender,int passoutyear,float weight)
	{
	System.out.println("=====================");
	System.out.println("my name is "+name);
	System.out.println("my PRN number is "+PRN);
	System.out.println("my branch is "+branch);
	System.out.println("my dept is "+dept);
	System.out.println("my gender is "+gender);
	System.out.println("my passout year is "+passoutyear);
	System.out.println("my weight is "+weight);
	}
}

