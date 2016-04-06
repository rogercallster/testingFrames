package verification;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.omg.CORBA.AnySeqHelper;
import org.mockito.Matchers.*;

@RunWith(MockitoJUnitRunner.class)
public class verificationClassTest {

	
	VerificationClass vc;
	
	@Before
	public void init(){
		vc = Mockito.mock( VerificationClass.class);
		
		Mockito.when(vc.verificationMethod(1)).thenReturn("Mocked Method 2");
		Mockito.when(vc.verificationMethod(Matchers.anyObject(), Matchers.anyInt())).thenReturn(2);
		
	}
	
	@Test
	public void test() {
	     //	vc.verificationMethod(1);
		vc.verificationMethod("STRING",2);
	  //	vc.verificationMethod("string");
		//Mockito.verify(vc).verificationMethod(1); 
		//Mockito.verify(vc, Mockito.times(1)).verificationMethod(1);
		Mockito.verify(vc, Mockito.times(1)).verificationMethod("STRING",2);

	}

}
