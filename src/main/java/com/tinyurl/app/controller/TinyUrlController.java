package com.tinyurl.app.controller;

import com.tinyurl.app.pojo.RequestObject;
import com.tinyurl.app.services.TinyUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TinyUrlController {

    @Autowired
    private TinyUrlService tinyUrlService;

    @RequestMapping(value = "/create-short", method = RequestMethod.POST)
    public ResponseEntity<Object> getTinyUrl(@RequestBody RequestObject request) {
        System.out.println("reqst receive");
        String shortUrl = tinyUrlService.encodeActualUrl(request);
        return new ResponseEntity<>(shortUrl, HttpStatus.OK);
    }



    @RequestMapping(value = "/originalUrl", method = RequestMethod.GET)
    public ResponseEntity<Object> getActualUrl(@RequestParam String shortUrl) {
        System.out.println("reqst received to decode");
        RequestObject request = new RequestObject();
        request.setTinyUrl(shortUrl);
        String longUrl = tinyUrlService.decodeTinyUrl(request);
        System.out.println("long url "+ longUrl);
        return new ResponseEntity<>(longUrl, HttpStatus.OK);
    }
}
