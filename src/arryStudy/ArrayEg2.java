package arryStudy;

public class ArrayEg2 {

	public static void main(String[] args) {
		
		int rollnm[]=new int[3];
		rollnm[0]=4;
		rollnm[1]=5;
		rollnm[2]=6;
	
		
		
		System.out.println(rollnm[2]);
		System.out.println("======");
		
		//1&2 declaration + initialization
		int rollnm1[]= {1,2,3,4,5,6};
		char grade[]= {'A','B','C','D'};
		System.out.println(rollnm1[3]);
		
		for(int i=0;i<=rollnm1.length-1;i++)
		{
			System.out.println(rollnm1[i]);
		}
		System.out.println("======");
		for(int i=rollnm1.length-1;i>=0;i--)
		{
			System.out.println(rollnm1[i]);
		}
		System.out.println("======");
		
		for(int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}
	}
}
