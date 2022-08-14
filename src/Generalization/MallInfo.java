package Generalization;

public class MallInfo {

	public static void main(String[] args) {
		PVR n=new PVR();
		n.Entry();
		n.Name();
		n.Shop();
		System.out.println("=====================");
		
		SAM s=new SAM();
		s.Entry();
		s.KFC();
		s.Name();
		System.out.println("=====================");
		
		KuwarMall k=new KuwarMall();
		k.Entry();
		k.facilities();
		k.Name();
		
		
	}

}
