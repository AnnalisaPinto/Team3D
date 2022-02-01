package heritage.controllerData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import heritage.model.Contact;

public class RecuperoJson<T> {

	public String downloadJson(String url) {
		String result = "";

		try {
			// Dovete accendere il server per eseguire questa!!
			URL paginaURL = new URL(url);

			HttpURLConnection client = (HttpURLConnection) paginaURL.openConnection();

			// client.setRequestProperty(result, result);

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
		return result;
	}

	public List<T> getList(String url, Class<T> contentClass) {
		String jSon = downloadJson(url);
		try {
			ObjectMapper mapper = new ObjectMapper();
			JavaType type = mapper.getTypeFactory().constructParametricType(LinkedList.class, contentClass);
			//TypeReference<List<Contact>> typeRef = new TypeReference<List<Contact>>() {};

			List<T> list = mapper.readValue(jSon, type);
			return list;
		} catch (JsonMappingException e) {
			List<T> list = new LinkedList<T>();
			e.printStackTrace();
			return list;
		} catch (JsonProcessingException e) {
			List<T> list = new LinkedList<T>();
			e.printStackTrace();
			return list;
		}
	}
//	public Users getObject(String url){
//		String jSon = downloadJson(url);
//		try {
//		ObjectMapper mapper=new ObjectMapper();
//		TypeReference<Users> typeRef 
//		  = new TypeReference<Users>() {};
//		  Users object = mapper.readValue(jSon, typeRef);
//		return object;
//		}catch(JsonMappingException e) {
//			Users object = null;
//			return object;
//		}
//		catch (JsonProcessingException e) {
//			Users object = null;
//			return object;
//		}
//	}
}
