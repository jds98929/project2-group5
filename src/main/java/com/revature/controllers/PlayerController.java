package com.revature.controllers;

import java.net.URI;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("player")
public class PlayerController {

	//"https://api.fantasydata.net/v3/nfl/stats/{format}/Players"
//	HttpHeaders headers = new HttpHeaders();
//	headers.setContentType(MediaType.APPLICATION_JSON);
//	headers.set("Authorization", "Bearer "+accessToken);
	@GetMapping
    public void getPlayer() {  
    HttpClient httpclient = HttpClients.createDefault();
	try
      {
    	  URIBuilder builder = new URIBuilder("https://api.fantasydata.net/v3/nfl/stats/json/Players");


          URI uri = builder.build();
          HttpGet request = new HttpGet(uri);
          request.setHeader("Ocp-Apim-Subscription-Key", "58be5a80612447b684f693e42e550f7e");

          HttpResponse response = httpclient.execute(request);
          HttpEntity entity = response.getEntity();

          if (entity != null) 
          {
              System.out.println(EntityUtils.toString(entity));
          }
      }
      catch (Exception e)
      {
          System.out.println(e.getMessage());
      }
    }
}
