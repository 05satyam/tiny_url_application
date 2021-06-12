package com.tinyurl.app.services;

import com.tinyurl.app.pojo.RequestObject;

public interface TinyUrlService {

    public void encodeActualUrl(RequestObject requestObject);

    public void decodeTinyUrl(RequestObject requestObject);
}
