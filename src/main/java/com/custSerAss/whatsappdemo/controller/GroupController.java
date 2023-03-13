package com.custSerAss.whatsappdemo.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@RestController
public class GroupController {
	
	OkHttpClient client = new OkHttpClient();

	 @GetMapping("/showGroups")
	  String run() throws IOException {
		 Request request = new Request.Builder()
				  .url("https://api.ultramsg.com/instance33994/groups?token=kz7bob34glp26poh")
				  .get()
				  .addHeader("content-type", "application/x-www-form-urlencoded")
				  .build();
		    
		  try (Response response = client.newCall(request).execute()) {
			  return response.body().string();
			 }
		 
	  }

}
