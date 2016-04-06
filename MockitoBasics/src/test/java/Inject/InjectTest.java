package Inject;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.Times;
import org.mockito.runners.MockitoJUnitRunner;
import org.testng.annotations.BeforeMethod;


//Note @InjectMocks annotation makes Mockito EITHER do constructor injection, OR setter/field injection, but NEVER both

public class InjectTest {
	
	
	@Mock
	private ClassToBeMocked cltm;
	
	@InjectMocks
	private	Inject inject = new Inject();//class to be injected with Mock
	

	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
		Mockito.when(cltm.returnString(0)).thenReturn("A string");
	}
	
	@Test
	public void test() {
	//	

		System.out.println(inject.manageRequest(0));
		Assert.assertEquals("A string", inject.manageRequest(0));
		Mockito.verify(cltm, Mockito.times(2)).returnString(0);

		
	}

}
