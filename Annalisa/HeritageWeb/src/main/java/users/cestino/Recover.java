package users.cestino;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import users.model.Users;

public class Recover {

	public static Users DataRecover(String selection) {

		String result = "";

		//List<Svg> svgs = null;

		try {

			URL paginaURL = new URL("http://localhost:8081/testServlet" + selection);

			HttpURLConnection client = (HttpURLConnection) paginaURL.openConnection();

			int responseCode = client.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine + "\n");
				}
				in.close();

				result = response.toString();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			ObjectMapper mapper = new ObjectMapper();
			//TypeReference<List<Svg>> typeRef = new TypeReference<List<Svg>>() {
			//};

			//svgs = mapper.readValue(result, typeRef);

		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}

		return null;//Users

	}

}
