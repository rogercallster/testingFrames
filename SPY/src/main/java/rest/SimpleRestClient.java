package rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Retention;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SimpleRestClient {

	// http://localhost:8080/RESTfulExample/json/product/get
	public String get(URL url) throws Exception {

		String returnString = "";
		try {
		
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String output;
			//System.out.println("Output from Server .... ");
			while ((output = br.readLine()) != null) {
			//	System.out.println(output);
				returnString = returnString + " " + output;
			}
			conn.disconnect();
		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		if(returnString.contains("ServiceNow, Inc. Common Stock")) {
			return returnString;
		} else {
			throw new Exception("Stock Does not exists");
		}
		

	}


}