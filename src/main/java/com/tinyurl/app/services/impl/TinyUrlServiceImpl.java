package com.tinyurl.app.services.impl;

import com.tinyurl.app.pojo.RequestObject;
import com.tinyurl.app.services.BaseConvertor;
import com.tinyurl.app.services.TinyUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("tinyUrlService")
public class TinyUrlServiceImpl implements TinyUrlService {

    @Autowired
    private BaseConvertor baseConvertor;

    @Override
    public String encodeActualUrl(RequestObject requestObject) {

        long inputId = 0;
        return baseConvertor.encode(inputId);
    }

    @Override
    public void decodeTinyUrl(RequestObject requestObject) {
        long inputId = baseConvertor.decode(requestObject.getTinyUrl());
    }
}
