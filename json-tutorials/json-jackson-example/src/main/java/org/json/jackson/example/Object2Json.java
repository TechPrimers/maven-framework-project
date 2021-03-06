package org.json.jackson.example;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Object2Json {

	public static void main(String[] args) {
		 
		User user = new User();
		ObjectMapper mapper = new ObjectMapper();
	 
		try {
	 
			// convert user object to json string, and save to a file
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/user.json"), user);
	 
			// display to console
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));
	 
		} catch (JsonGenerationException e) {
	 
			e.printStackTrace();
	 
		} catch (JsonMappingException e) {
	 
			e.printStackTrace();
	 
		} catch (IOException e) {
	 
			e.printStackTrace();
	 
		}
	 
	  }
	
}
