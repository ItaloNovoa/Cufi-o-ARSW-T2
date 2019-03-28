package dos.examen.parcial.html;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Service;

@Service
public class examHTML {
	
	
	public examHTML() {		
	}

	private static final String USER_AGENT = "Mozilla/5.0";

	
	
	public static String getCiudad(String ciudad) throws IOException {
		try {			
			URL obj = new URL("http://api.openweathermap.org/data/2.5/weather?q="+ciudad+"&appid=3ce78fbe36002d701d6ee68baec849cc");
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", USER_AGENT);

			//The following invocation perform the connection implicitly before getting the code
			int responseCode = con.getResponseCode();
			System.out.println("GET Response Code :: " + responseCode);
			StringBuffer response = new StringBuffer();
			if (responseCode == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(
						con.getInputStream()));
				String inputLine;
				

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();				
			}
			return response.toString();
		} catch (Exception e) {
			e.getMessage();
		}
		return ciudad;
	}
}

