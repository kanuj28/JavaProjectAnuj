package Interface;

public interface Father {

	void aggresive();
	
	void backbone();
	
	default void love()
	{
		System.out.println("father is love");
	}
	static void nature()
	{
		System.out.println("fahers nature");
	}
}
