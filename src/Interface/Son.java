package Interface;

public class Son implements Father,Mother {

	public static void main(String[] args) {
		Son s=new Son();
		s.aggresive();
		s.backbone();
		s.beauty();
		s.caring();
		s.bike();
		s.love();
		Mother.nature();
		Father.nature();
		}
	@Override
	public void beauty() {
		System.out.println("my mother is beautiful");
	}
	@Override
	public void caring() {
		System.out.println("my mother is a caring person");	
	}
	@Override
	public void aggresive() {
		System.out.println("my father is a chilled person");
	}
	@Override
	public void backbone() {
		System.out.println("my father is a backbone of family");	
	}
	public void bike()
	{
		System.out.println("i have a bike called bajaj pulsur 220f");
	}
	@Override
	public void love() {
	
		Mother.super.love();
		Father.super.love();
	}
	

	

}
