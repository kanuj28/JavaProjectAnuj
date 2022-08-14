package stringStudy;

public class StringMethods {

	public static void main(String[] args) {
		String s="HI";//created string without using new keyword
		String s1=new String("Hello");//created using new keyword
		String s4="Hey";
		String s3=new String("how r u");
		
//(1) use of length method
		System.out.println(s1.length());
		System.out.println(s4.length());
		System.out.println(s3.length());
		
		int myLength = s1.length();
        System.out.println(myLength);
        
        int yourLength=s4.length();
        System.out.println(yourLength);
        
        String s2="";
        System.out.println(s2.length());
        
      //  String s3=null;
      //  System.out.println(s3.length());
        System.out.println("===============");
        
 //(2) use of toUpperCase() method
        String a="velocity";
        System.out.println(a);
        System.out.println(a.toUpperCase());
        String d="anuj";
        System.out.println(d);
        System.out.println(d.toUpperCase());
        String c=d.toUpperCase();
        System.out.println(c);
        String b=a.toUpperCase();
        System.out.println(b);
        System.out.println("=================");
        
//(3) use of toLowerCase() method
        System.out.println(a.toLowerCase());
        System.out.println(c.toLowerCase());
        System.out.println("================");
        
//(4) use of equals() method
        String v0="velocity";
        String v1="velocity";
        String v2=new String("velocity");
        String v3=new String("velocity");
        String v4=new String("velocity");
        String v5="corporate";
        String v6="corporate";
        String v7=new String("corporate");
        String v8=new String("corporate");
        String v9=new String("corp");
        
        System.out.println(v0==v1);
        System.out.println(v1==v2);
        System.out.println(v2==v3);
        System.out.println("=================");
        System.out.println(v0.equals(v1));
        System.out.println(v1.equals(v2));
        System.out.println(v3.equals(v2));
        System.out.println(v3.equals(v4));
        System.out.println("=================");
        System.out.println(v5==v6);
        System.out.println(v6==v7);
        System.out.println(v7==v8);
        System.out.println("=================");
        System.out.println(v8.equals(v8));
        System.out.println(v8.equals(v9));
        
 //(5) equals ignore Case method
        System.out.println(v1.equalsIgnoreCase(v5));
        System.out.println("================");
        
 //(6) contains()method use
        String e="corporate";
        System.out.println("cor");
        System.out.println("================");
        
 //(7) isEmpty()method use
        String e0="pune";
        String e1=" ";
        String e2=null;
        String e3="";
        System.out.println(e0.isEmpty());
        System.out.println("result");
        System.out.println(e1.isEmpty());
      //System.out.println(e2.isEmpty());
        System.out.println(e3.isEmpty());
        System.out.println("===============");
      //System.out.println(e0.isBlank());
      //System.out.println(e1.isBlank());
      //System.out.println(e3.isBlank());
        System.out.println("==============");
        
 //(8) charAt method use
        String w="Thane";
        System.out.println(w.charAt(0));
        System.out.println(w.charAt(2));
        // System.out.println(ans);
        //System.out.println(w.charAt(9));
        System.out.println("==============");

 //(9) endsWith method use
      String h="abcd";
      System.out.println(h.endsWith("d"));
      System.out.println(h.endsWith("c"));
      System.out.println(h.endsWith("b"));
      System.out.println("===============");

 //(10) startsWith method use
      String y="india";
      System.out.println(y.startsWith("in"));
      System.out.println(y.startsWith("ind"));
      System.out.println(y.startsWith("india"));
      System.out.println(y.startsWith("dia",2));
      System.out.println(y.startsWith("ind",0));
      System.out.println("================");
 
 //(11) substring method use
     String j="jabalpur";
     System.out.println(j.substring(5));
     String str=j.substring(3);
     System.out.println(str);
     System.out.println(j.substring(0,4));
     System.out.println("===============");
     
 //(12) concat method use
     String a1="Gov of";
     String a2=" India";
     System.out.println(a1.concat(a2));
     System.out.println(a1.concat(" jabalpur"));
     System.out.println("========");
 
 //(13) index of method use
     String t="Tea";
     int index=t.indexOf('e');
     System.out.println(index);
     System.out.println("========");
     
 //(14) lastIndex of method use
     String t1="India is my country which is 2nd biggest";
     System.out.println(t1.indexOf('n'));
     System.out.println(t1.lastIndexOf('i'));
     System.out.println(t1.indexOf('i',24));
     System.out.println("=======");
     
 //(15) replace of method use
     String m4="testing";
     System.out.println(m4.replace('t','o'));
     System.out.println(m4.replace("ing", ""));
	}

}
