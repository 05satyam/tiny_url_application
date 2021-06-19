package com.tinyurl.app.controller;

import com.tinyurl.app.pojo.RequestObject;
import com.tinyurl.app.services.TinyUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TinyUrlController {

    @Autowired
    private TinyUrlService tinyUrlService;

    @RequestMapping(value = "/create-short", method = RequestMethod.POST)
    public ResponseEntity<Object> getTinyUrl(@RequestBody RequestObject request) {
        String shortUrl = tinyUrlService.encodeActualUrl(request);
        return new ResponseEntity<>(shortUrl, HttpStatus.OK);
    }



    @RequestMapping(value = "/shortUrl", method = RequestMethod.GET)
    public ResponseEntity<Object> getActualUrl(@RequestBody RequestObject request) {
        String longUrl = tinyUrlService.decodeTinyUrl(request);
        return new ResponseEntity<>(longUrl, HttpStatus.OK);
    }
}
