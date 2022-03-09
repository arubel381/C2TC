import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
public class ArgumentSourceDemo {
	@ParameterizedTest
	@MethodSource("createWordsWithLength")
	void withMethodSource(String word, int length)
	{
		
	}
	private static Stream<Arguments>createWordsWithLength()
	{
		return Stream.of(
				Arguments.of("Hello",5),
				Arguments.of("JUnit 5",5)
				);
	}
		
}
