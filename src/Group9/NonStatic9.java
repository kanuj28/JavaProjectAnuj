package Group9;

public class NonStatic9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStatic9 n=new NonStatic9();
		n.studentinfo();
        NonStaticDiffClass m=new NonStaticDiffClass();
        m.multiply();
        }
     public void studentinfo()
{
    	 String name;
    	 String pnr;
    	 boolean result;
    	 float weight;
    	 char gender;
    	 
    	 name="velocity";
    	pnr="AS335";
    	result=true;
    	weight=60;
    	gender='M';
    	
    	System.out.println("my name is "+name);
    	System.out.println("pnr "+pnr);
    	System.out.println("result "+result);
    	System.out.println("weight "+weight+"kg");
    	System.out.println("gender "+gender);
    	
    	 }
}
