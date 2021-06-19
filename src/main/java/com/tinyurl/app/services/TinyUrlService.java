package com.tinyurl.app.services;

import com.tinyurl.app.pojo.RequestObject;

public interface TinyUrlService {

    public String encodeActualUrl(RequestObject requestObject);

    public String decodeTinyUrl(RequestObject requestObject);
}
