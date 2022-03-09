import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import org.junit.jupiter.api.function.Executable;

import java.util.Arrays;
import java.util.Collection;
public class DynamicTests {
	@TestFactory
	Collection<DynamicTest> dynamicTests()
	{
		return Arrays.asList(
			dynamicTest("Simple dynamic test",() -> assertTrue(true)),	
			dynamicTest("My Executable Class",new MyExecutable()),	
			dynamicTest("Exception Executable",() -> {throw new Exception("Exception Example");}),
			dynamicTest("Simple dynamic test-2",() -> assertTrue(true))
				);
	}
	public class MyExecutable implements Executable {

		@Override
		public void execute() throws Throwable {
			System.out.println("Hello World!");

		}

	}

}
