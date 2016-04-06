package HelloWorld.Mockito;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class MockitoHelloWorldExample {

	@Test
	public void fooGreet() {
		Foo foo = mock(Foo.class);
		
		when(foo.greet()).thenReturn("hello world"); // stubbing behavior
		System.out.println("Foo greets: " + foo.greet());
		assertEquals(foo.greet(), "hello world");
	}

}
