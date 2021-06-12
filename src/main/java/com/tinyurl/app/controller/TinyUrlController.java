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

    @RequestMapping(value = "/encode", method = RequestMethod.POST)
    public ResponseEntity<Object> getTinyUrl(@RequestBody RequestObject request) {

        return new ResponseEntity<>("", HttpStatus.OK);
    }



    @RequestMapping(value = "/decode", method = RequestMethod.GET)
    public ResponseEntity<Object> getActualUrl(@RequestBody RequestObject request) {

        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
