package com.tinyurl.app.services.impl;

import com.tinyurl.app.dao.TinyUrlDao;
import com.tinyurl.app.pojo.RequestObject;
import com.tinyurl.app.services.BaseConvertor;
import com.tinyurl.app.services.TinyUrlService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Date;

@Service("tinyUrlService")
public class TinyUrlServiceImpl implements TinyUrlService {
    @Autowired
    private  TinyUrlDao tinyUrlDao;

    @Autowired
    private BaseConvertor baseConvertor;

    @Override
    public String encodeActualUrl(RequestObject requestObject) {

        long inputId = 0;
        return baseConvertor.encode(inputId);
    }

    @Override
    public String decodeTinyUrl(RequestObject requestObject) {
        long inputId = baseConvertor.decode(requestObject.getTinyUrl());
        var entity = tinyUrlDao.findById(inputId)
                .orElseThrow(() -> new EntityNotFoundException("There is no entity with " + requestObject.getTinyUrl()));
        if (entity.getExpireDate() != null && entity.getExpireDate().before(new Date())){
            tinyUrlDao.delete(entity);
            throw new EntityNotFoundException("Link expired!");
        }

        return entity.getOriginalUrl();
    }
}
