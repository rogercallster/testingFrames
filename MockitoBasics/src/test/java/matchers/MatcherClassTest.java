package matchers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class MatcherClassTest {

	@Mock
	public MatcherClass mct;
	
	@Before
	public void init(){
		mct = Mockito.mock( MatcherClass.class);
		when(mct.factorial(anyInt())).thenReturn(100);
		
	} 
	@Test
	public void test() {
		System.out.println(mct.factorial(10));
		assertEquals(mct.factorial(10),100);
	}

}
