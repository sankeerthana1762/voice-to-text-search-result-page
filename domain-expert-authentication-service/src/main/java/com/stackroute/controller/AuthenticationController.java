package com.stackroute.controller;

import com.stackroute.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    AuthenticationService authenticationService;

   @GetMapping("api/v1")
   //controller method to getValues of userName and password and validate
    public boolean authenticateDomainExpert(@RequestParam String userName,@RequestParam String password){
       return authenticationService.authenticateDomainExpert(userName,password);
    }

}
