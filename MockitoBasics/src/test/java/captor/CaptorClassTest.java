package captor;

import static org.junit.Assert.*;


import org.junit.Test;
import org.mockito.*;


//argument capture can be helpful to identify argument for a complex method parameters to test a method parameter have a certain value etc
public class CaptorClassTest {

	@Test
	public void test() {
		ParentClass pc = Mockito.mock(ParentClass.class);
		
		ArgumentCaptor<String> arg = ArgumentCaptor.forClass(String.class); // to capture the argument
		
		CaptorClass cc = new CaptorClass(pc);
		
		System.out.println(cc.save("mock test")); // argument is "mock test"
		
		Mockito.verify(pc).save(arg.capture());
		
		assertEquals("mock test", arg.getValue());

	}

}
