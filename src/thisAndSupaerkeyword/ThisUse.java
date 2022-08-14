package thisAndSupaerkeyword;

public class ThisUse {
	int a=100;
	int b=200;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ThisUse t=new ThisUse();
       t.test();
       
	}
       public void test()
{
    	   int a=20; //local variable
    	   int sum=a+150;//a value is local value
    	   System.out.println(sum);
    	   
    	   int sum1=this.a+150;//a value is global value
    	   System.out.println(sum1);
    	   
    	   System.out.println("local value of a is "+a);
    	   System.out.println("global value of a is "+this.a);
    	   System.out.println(b);
    			  
    	   
    	   }
}
