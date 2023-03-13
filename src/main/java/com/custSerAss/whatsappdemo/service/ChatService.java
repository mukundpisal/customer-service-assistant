package com.custSerAss.whatsappdemo.service;

import java.util.List;

import com.custSerAss.whatsappdemo.model.Chat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ChatService {
  // public Chat get(Long id);

  public Chat getByChatId(String chatId);

  public List<?> getChatsWithLastMessage();

  public List<Chat> getAll();

  public Chat save(Chat chat);

  public Chat update(Long id, Chat chat);

  public Chat delete(Long id);
}
