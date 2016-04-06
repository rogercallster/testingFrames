package spyBasicTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import spyBasic.MyBaseClass;

@RunWith(MockitoJUnitRunner.class)
public class SpyBasicTest {

	private MyBaseClass mbc;
	private MyBaseClass spyMbc;
	private MyBaseClass mockedMbc;

	@Before
	public void buildSpyObject() {
		mbc = new MyBaseClass();
		
		spyMbc = Mockito.spy(mbc); // differs from how Mock will work. Spy Mocks
									// only few Methods while other remain in
									// original State While Mock Will Mock whole
									// class IRRESPECTIVE of the methods. 
		when(spyMbc.Method2()).thenReturn("Spy Method 2");
		
		
		/*Shows difference between Mock and Spy*/
		mockedMbc = Mockito.mock(MyBaseClass.class);
		when(mockedMbc.Method2()).thenReturn("Mocked Method 2");
	}

	@Test
	public void test() {
		System.out.println(spyMbc.Method1());
		System.out.println(spyMbc.Method2());
		System.out.println(spyMbc.Method3());
		assertEquals("Spy Method 2", spyMbc.Method2());
		assertEquals("Spy Method 2", spyMbc.Method3());
		
		/*Mocked Object testing*/
		System.out.println(mockedMbc.Method1());
		System.out.println(mockedMbc.Method2());
		System.out.println(mockedMbc.Method3());
		assertEquals("Mocked Method 2", mockedMbc.Method2());
		assertEquals(null, mockedMbc.Method3());
		

	}

}
