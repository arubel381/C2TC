package firstprogram;

interface Vehicle
{
	void Engine();
}
interface Bike extends Vehicle{
	void getMileage();
}
class R15 implements Bike
{
	public void Engine() {
		System.out.println("liquid");
	}
	public void getMileage() {
		System.out.println("Mileage is 40 km/L");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		R15 bike = new R15();
		bike.Engine();
		bike.getMileage();
	}
}
