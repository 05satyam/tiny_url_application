# tiny_url_application

This is a tiny url spring boot application. Here, encoding/decoding or url is done using base64 conversion.
As of now hash is not implemented and stored in db and no user registration is also handled. 
Steps:  5.1. enter the url and expiration time in postman json object. 
        5.2 after submiting a tiny-url will be given in response.
          5.2.1 if entered url expiration time is over then record will be deleted and Link expired! will be shown
          5.2.2 if entered url is not expried then original url will be sent back in response.
          
NOTE: as of now same url can have multiple short url as no such handling is done.


POSTMAN link for curls: https://www.getpostman.com/collections/386f993c80f0b544366a
        
