package Interface;

public interface Mother {

	void beauty();
	
	void caring();
	
	default void love()
	{
		System.out.println("mothers love");
	}
	static void nature()
	{
		System.out.println("mothers nature");
	}
}
