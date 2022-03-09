import static org.junit.Assert.assertNotNull;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo1 {
	@ParameterizedTest
	@ValueSource(ints = {1,2,3 } )
	void withValueSource(String number)
	{
		assertNotNull(number);
	}
}
