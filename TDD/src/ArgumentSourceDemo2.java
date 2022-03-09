import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
public class ArgumentSourceDemo2 {
	@ParameterizedTest
	@CsvFileSource(resources = "/users.csv")
	void withUsersFromCSV(int id, String name)
	{
		
	}	
}
