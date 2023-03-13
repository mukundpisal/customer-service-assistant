package com.custSerAss.whatsappdemo.service;

import com.custSerAss.whatsappdemo.model.ApiClient;

public interface ApiClientService {

  public ApiClient get(Long id);

  public ApiClient findByInstanceNumber(int instanceNumber);

  public ApiClient save(ApiClient chat);

  public ApiClient update(Long id, ApiClient chat);

  public ApiClient delete(Long id);
}
