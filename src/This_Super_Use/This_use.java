package This_Super_Use;

public class This_use {
	int a=90; //global variable
	int b=100;//global variable
	static int c=110;//static global variable

	public static void main(String[] args) {
		This_use t=new This_use();
		t.display();
	}

	public void display()
	{
		int a=10;
		int b=20;
		int c=30;
		System.out.println(a);//calling local variable
		System.out.println(this.a);//calling global variable using this keyword
		System.out.println(b);//calling local variable
		System.out.println(this.b);//calling global variable using this keyword
		System.out.println(c);//calling local variable
		System.out.println(this.c);//calling static global variable using this keyword
        	}
}
