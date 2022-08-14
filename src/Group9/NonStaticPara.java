package Group9;

public class NonStaticPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStaticParaDiff m=new NonStaticParaDiff();
		m.averagemarks(55.3f,59.6f,57.3f,58,57);
	    m.averagemarks(51.2f, 98.3f, 99.3f, 84, 83);
				
NonStaticPara n=new NonStaticPara();
n.info("swapnil","wardha",442001);
n.info("swapnil","yawanti",445202);
n.info("anuj","jabalpur",482001);
	}
   public void info(String name,String city,int pincode)
   {
	   //String name;
	   //name="Anuj";
	  // String city;
	  // city="jabalpur";
	  // int pincode;
	  // pincode=482001;
	   System.out.println("\nname= "+name + "\ncity= "+city + "\npincode= "+pincode);
	   System.out.println("================");
	   
   }
}


