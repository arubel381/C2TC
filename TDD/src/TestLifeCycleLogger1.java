import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycleLogger1
{
	@BeforeAll
	default void BeforeAllTests()
	{
		System.out.println("Before All Test");
	}
	@AfterAll
	default void AfterAllTests()
	{
		System.out.println("After All Test");
	}
	@Test
	default void TestMethod()
	{
		System.out.println("This is test method");
	}
}