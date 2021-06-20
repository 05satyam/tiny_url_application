package com.tinyurl.app.services.impl;

import com.tinyurl.app.dao.TinyUrlDao;
import com.tinyurl.app.entity.TinyUrl;
import com.tinyurl.app.pojo.RequestObject;
import com.tinyurl.app.services.BaseConvertor;
import com.tinyurl.app.services.TinyUrlService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.sql.Date;

@Service("tinyUrlService")
public class TinyUrlServiceImpl implements TinyUrlService {
    @Autowired
    private  TinyUrlDao tinyUrlDao;

    @Autowired
    private BaseConvertor baseConvertor;

    @Override
    public String encodeActualUrl(RequestObject requestObject) {
        var url = new TinyUrl();
        url.setOriginalUrl(requestObject.getActualUrl());
        url.setExpireDate(requestObject.getExpiryDate());

        url.setCreatedAt(new Date(System.currentTimeMillis()));
        System.out.println("rqst obj actual url: "+ requestObject.getActualUrl());
        var entity = tinyUrlDao.save(url);
        System.out.println("entity "+ entity);
        return baseConvertor.encode(entity.getId());
    }

    @Override
    public String decodeTinyUrl(RequestObject requestObject) {
        long inputId = baseConvertor.decode(requestObject.getTinyUrl());
        var entity = tinyUrlDao.findById(inputId)
                .orElseThrow(() -> new EntityNotFoundException("There is no entity with " + requestObject.getTinyUrl()));
        if (entity.getExpireDate() != null && entity.getExpireDate().before(new Date(System.currentTimeMillis()))){
            tinyUrlDao.delete(entity);
            throw new EntityNotFoundException("Link expired!");
        }

        return entity.getOriginalUrl();
    }
}
