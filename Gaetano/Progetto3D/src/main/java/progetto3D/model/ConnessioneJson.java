package progetto3D.model;

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
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConnessioneJson {

	public String downloadJson(String url) {
		String result="";
		
		try {
			//Dovete accendere il serve per eseguire questa!!
			URL paginaURL=new URL(url);
			
			HttpURLConnection client = (HttpURLConnection) paginaURL.openConnection();  
			
			//client.setRequestProperty(result, result);
			
			int responseCode = client.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) { 
				BufferedReader in = new BufferedReader(new InputStreamReader(
						client.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine+"\n");
				}
				in.close();
				
				result=response.toString();
			}
		} catch (MalformedURLException e) { 
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		return result;
	}
	
	public List<Svg> getList(String url){
		String jSon = downloadJson(url);
		try {
		ObjectMapper mapper=new ObjectMapper();
		TypeReference<List<Svg>> typeRef 
		  = new TypeReference<List<Svg>>() {};
		List<Svg> list = mapper.readValue(jSon, typeRef);
		return list;
		}catch(JsonMappingException e) {
			List<Svg>list = new LinkedList<Svg>();
			return list;
		}
		catch (JsonProcessingException e) {
			List<Svg>list = new LinkedList<Svg>();
			return list;
		}
	}
	public Svg getObject(String url){
		String jSon = downloadJson(url);
		try {
		ObjectMapper mapper=new ObjectMapper();
		TypeReference<Svg> typeRef 
		  = new TypeReference<Svg>() {};
		Svg object = mapper.readValue(jSon, typeRef);
		return object;
		}catch(JsonMappingException e) {
			Svg object = null;
			return object;
		}
		catch (JsonProcessingException e) {
			Svg object = null;
			return object;
		}
	}
}
