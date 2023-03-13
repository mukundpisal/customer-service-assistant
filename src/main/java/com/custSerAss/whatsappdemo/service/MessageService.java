package com.custSerAss.whatsappdemo.service;
import com.custSerAss.whatsappdemo.model.Message;

import java.util.List;


public interface MessageService {
  public Message get(Long id);

  public List<Message> getByChatID(String chatID);

  public Message getLastMessage(String chatID);

  public List<Message> getAll();

  public Message save(Message message);

  public Message update(Long id, Message message);

  public Message delete(Long id);
}
