package com.custSerAss.whatsappdemo.service;

import com.custSerAss.whatsappdemo.exception.CouldNotCreateResourceException;
import com.custSerAss.whatsappdemo.model.Message;
import com.custSerAss.whatsappdemo.model.WebhookPayload;

public interface WebhookService {

  public Message receiveFromChatAPI(WebhookPayload request) throws CouldNotCreateResourceException;

  public Message sendToChatAPI(Message message) throws CouldNotCreateResourceException;
}
