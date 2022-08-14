package Group9;

public class StaticWithPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     studentinfo("ajay","ak123","rdvv",12345);
     studentinfo("uday","ve124","rgpv",15632);
     studentinfo("shekhar","re345","rdvv",36245); 
     StaticParaDiffClass.mathoperation(10,40);
     }
     

	
   public static void studentinfo(String name,String prn,String univercity,int rollnumber)
   {
	   //usage
	   System.out.println("\n name= " +name + "\n prn= " +prn + "\n univercity= " +univercity+ "\n rollnumber= "+rollnumber);
	   
   
 //System.out.println("student name is "+name);
  //System.out.println("prn code is "+prn);
  //System.out.println("univercity name is "+univercity);
  //System.out.println("rollnumber is "+rollnumber);
	
   }
   }
