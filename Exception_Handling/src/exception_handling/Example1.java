package exception_handling;

class InvalidDirectionException extends Exception{
	String HouseDirection;
	public InvalidDirectionException(String GpsLocation)
	{
		HouseDirection = GpsLocation;
	}
	public String toString()
	{
		return("MyException Ocurred: "+ HouseDirection);
	}
}

public class Example1 {

	public static void main(String[] args) {
		try {
            throw new InvalidDirectionException("you are going in wrong direction");
        }
        catch (InvalidDirectionException ex) {
            System.out.println("you are going in correct direction");
        }

	}

}
