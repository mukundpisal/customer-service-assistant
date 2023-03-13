package com.custSerAss.whatsappdemo.controller;

import java.io.IOException;
import java.util.List;

import com.custSerAss.whatsappdemo.model.Message;
import com.custSerAss.whatsappdemo.service.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@RestController
//@RequestMapping("/message")
@Tag(name = "Message")
public class MessageController {
  
  @Autowired
  MessageService service;
  
  
  OkHttpClient client = new OkHttpClient();

  @GetMapping("/show")
  String run() throws IOException {
	  Request request = new Request.Builder()
	    .url("https://api.ultramsg.com/instance33994/chats/messages?token=kz7bob34glp26poh&chatId=919504050400@c.us&limit=50")
	    .get()
	    .addHeader("content-type", "application/x-www-form-urlencoded")	 
	    .build();
	    
	  try (Response response = client.newCall(request).execute()) {
		  return response.body().string();
		 }
	 
  }
  @PostMapping("/send")
  String post(String json) throws IOException {
  RequestBody body = new FormBody.Builder() 
  			.add("token", "kz7bob34glp26poh")
  			.add("to", "+919373460926")
  			.add("body", "Massage send Succesfully")

              .build();

  Request request = new Request.Builder()
    .url("https://api.ultramsg.com/instance33994/messages/chat")
    .post(body)
    .addHeader("content-type", "application/x-www-form-urlencoded")
    .build();

  
	   try (Response response = client.newCall(request).execute()) {
	    return response.body().string();
  }
  }
  @DeleteMapping("/delate")
  String delate() throws IOException {
	  RequestBody body = new FormBody.Builder() 
				.add("token", "kz7bob34glp26poh")
				.add("msgId", "false_919504050400@c.us_0F896D8D3495C6AB86")


	            .build();

	Request request = new Request.Builder()
	  .url("https://api.ultramsg.com/instance33994/messages/delete")
	  .post(body)
	  .addHeader("content-type", "application/x-www-form-urlencoded")
	  .build();

	  try (Response response = client.newCall(request).execute()) {
		    return response.body().string();
  }
}
}
  
