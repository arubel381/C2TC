package steamapi;

public interface Actor {
	void act();
	void speak();
	default void comedy()
	{
		System.out.println("I have humour sense");
	}
}


