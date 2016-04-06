package getTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.net.MalformedURLException;
import java.net.URL;

import rest.SimpleRestClient;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.Test;

public class SimpleRestClientGetTests {
	
	URL url;
	public SimpleRestClientGetTests() throws MalformedURLException {
		 url = new URL("http://finance.yahoo.com/webservice/v1/symbols/NOW/quote?format=json");
	}
	@Mock 
	SimpleRestClient src ;
	
	
	@Before
	public void init() throws Exception {
		MockitoAnnotations.initMocks(this);
		when(src.get(url)).thenReturn("");
		//when ((src.get(url).contains("[  ]")).);
		
	}
	
    String getTest(){
    	try {
    		System.out.println(new SimpleRestClient().get(url));

			return src.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
    } 

	
	@Test (expected=Exception.class)
	public void test()  {
		assertEquals(true, getTest().contains("ServiceNow, Inc. Common Stock"));
		
	}

}
