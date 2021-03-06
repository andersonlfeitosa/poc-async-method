package com.andersonlfeitosa.openshift;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
  
  @Autowired
  private GitHubLookupService service;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String async() {
    return "Hello World";
  }

}
