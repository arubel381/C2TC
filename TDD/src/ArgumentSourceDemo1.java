import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class ArgumentSourceDemo1 {
	@DisplayName("Roman Numeral")
	@ParameterizedTest(name = "\" {0}\" should be {1}")
	@CsvSource({"I,1", "II,2", "V,5"})
	void withNiceName(String word, int number)
	{
		
	}	
}
