package Group9;

public class Constructerwithpara {
String Name;
char Grade;
int a;
int b;
int c;
    
    public Constructerwithpara(int x)
      {
    a=x;
    //System.out.println("value of x is :"+x);
    }
    public Constructerwithpara(int x,char y)
    {
    	b=x;
    	//System.out.println("value of x is :"+x);
    	Grade=y;
    	//System.out.println("value of y is :"+y);
    }
    public Constructerwithpara(int x,String location,float weight)
    {
    	c=x;
    	Name=location;
    	weight=75.6f;
    }
    
    public static void main(String[] args) {
		//with parameter
 Constructerwithpara c=new Construcerwithpara(); 

	}
}
