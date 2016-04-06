package implementation;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import implementation.Maths;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TestCase1 {
	
	@Mock
	Maths mathObj;

	@Before
	public void initalizeMockito() {
		MockitoAnnotations.initMocks(this);
		// mathObj = mock(Maths.class);
		when(mathObj.add(2, 2)).thenReturn(5);
		when(
				mathObj.div(org.mockito.Matchers.anyInt(),
						org.mockito.Matchers.eq(0))).thenThrow(
				new ArithmeticException());
		
		when(mathObj.div(21,23)).thenReturn(8888);
	}

	@Test(expected = ArithmeticException.class)
	public void testInOrder() throws Exception {
		testA();
		testB();
		testC();
		testD();
	}

   @Test
	public void testA() {
		assertEquals(5, mathObj.add(2, 2)); // basic Example of mocked output
	}

	
	@Test(expected = ArithmeticException.class) // stub handling exception
	public void testB() {
		mathObj.div(21, 0);

	}

	@Test
	public void testC() {
		assertEquals(8888, mathObj.div(21, 23));//when stub found without exception
	}
	
	@Test 
	public void testD(){
		
		assertEquals(0, mathObj.add(0, 2));//when no stub found
	}
}
