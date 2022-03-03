package steamapi;

public class Villian implements Actor {
	public void act()
	{
		System.out.println("I can act");
	}
	public void speak()
	{
		System.out.println("I can speak");
	}
	public void rude()
	{
		System.out.println("I can be rude");
	}

	public static void main(String[] args) {
		Villian v = new Villian();
		v.act();
		v.speak();
		v.rude();
		v.comedy();

	}

}
