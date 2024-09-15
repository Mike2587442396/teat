package demo;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
public class HelloTest{
	@Test
	public void testHello(){
		Hello hello = new Hello();
		String result = hello.sayHello("Json");
		assertEquals("Hello Json!", result);
	}
}


