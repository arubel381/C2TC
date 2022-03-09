import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
public class HelloWorldTest1 implements TestLifeCycleLogger1 {
@Test
@RepeatedTest(10)
void Test()
{
	System.out.println("First Test Case");
}
}
