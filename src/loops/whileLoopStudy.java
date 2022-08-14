package loops;

public class whileLoopStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //i want 4 table
		// initialization-->4
		//conditon------->i<=40
		//updation------->i=i+40
		
		//initilization
	
		int i=4;
		while(i<=40) //condition//4,8,12,36,40,44
		{
			System.out.println(i); //4,8,12.....,36,40
			i=i+40;//updation// 8,12.....,36,40,44
			
		}
		
		System.out.println("===========");
		
		// i want 4 table in reverse order
		//intilization-->40
		//condition------>i>=4
		//updation------>i=i-4
		
		int a=40;
		while(a<=4)
		{
			System.out.println(a); //4
			a=a-4; //0
		}
	}

}
