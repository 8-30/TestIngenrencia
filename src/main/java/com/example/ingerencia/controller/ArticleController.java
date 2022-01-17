package com.example.ingerencia.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.net.URL;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/article")
public class ArticleController {
	@Value("${ingerencia.api.url}")
	String route;
	
	@GetMapping("/getArticles")
	public Map<String,Object> getArticle() {
		InputStream inputs=null;
		try {
			URL url= new URL(route);
			HttpURLConnection conection = (HttpURLConnection)url.openConnection();
	        conection.setRequestProperty("Content-Type", "application/json; utf-8");
	        conection.setRequestProperty("Accept", "application/json");
			if(conection.getResponseCode()==HttpURLConnection.HTTP_OK||conection.getResponseCode()==HttpURLConnection.HTTP_MOVED_PERM||conection.getResponseCode()==HttpURLConnection.HTTP_MOVED_TEMP) {
				inputs = conection.getInputStream();
			} 
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(
		            inputs));

		    StringBuilder response = new StringBuilder();
		    String currentLine;

		    try {
				while ((currentLine = in.readLine()) != null) 
				    response.append(currentLine);
			    in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    JSONObject jsonObj = new JSONObject(response.toString());
		    
		return jsonObj.toMap();
	}
}
