package intro;

public class  MyInformation {

	public static void main(String[] args) {
		 // Name RollNum Age Gender Grade Weight Height Result
      
		 //1. variable declaration
              String name;
              int rollNum;
              int age;
              char gender;
              char grade;
              float weight;
              int height;
              boolean result;
        
        //2.  variable initialization (Assigning or Inserting value)
              name= "Anuj Kushwaha";
              rollNum=2048;	 
              age=29;
              gender='M';
              grade='A';
              weight=62.5f;
              height=165;
              result=true;
                
        //3.  usage
              System.out.println("My name is "+name);
              System.out.println("My rollnum is "+rollNum);
              System.out.println("My age "+age);
              System.out.println("Gender "+gender);
              System.out.println("Grade "+grade);
              System.out.println("Weight "+weight);
              System.out.println("My height is "+height+" CM");
              System.out.println("My result is "+result);
	}

}