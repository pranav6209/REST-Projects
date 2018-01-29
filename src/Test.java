import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;

import javax.net.ssl.HttpsURLConnection;

import org.glassfish.jersey.client.ClientConfig;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		// URL Created in a Previous class. Resource CLass.
		
		// URL Object Refereed to Resource 
		URL url = new URL("http://localhost:9999/RestfullProj/rest/customer/IND/101");
		
		// Opening a connection 
		HttpURLConnection urlConnection = (HttpsURLConnection)url.openConnection();
		
		// What type of Request we are accepting
		urlConnection.setRequestMethod("GET");
		
		BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(urlConnection.getInputStream()));
		
		// reading the Response
		String str = bufferedReader.readLine();
		
		while (str!=null) {
			
			System.out.println(str);
			
			str =bufferedReader.readLine();
			
		}
		
		// closing the connection 
		urlConnection.disconnect();
		
		
	}

	ClientConfig config = new ClientConfig();
	


}

