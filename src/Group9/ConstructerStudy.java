package Group9;


public class ConstructerStudy {
	int a;
	int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructerStudy c=new ConstructerStudy();
c.add();
c.multiplicaiton();
c.divison();

	}
public ConstructerStudy() //constructer
{
	a=99;
	b=99;
}
public void add()
{
	int c;
	c=a+b;
	System.out.println("addition is "+c);
}
	public void multiplicaiton()
	{
		int c;
		c=a*b;
		System.out.println("multiplication is "+c);
	
}
	public void divison()
	{
		int c;
		c=a/b;
		System.out.println("division is "+c);
	}
}
