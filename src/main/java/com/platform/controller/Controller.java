package com.platform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{

  @GetMapping("/")
  public String home()
  {
    return "This is baackend application check out https://socio-connect-chi.vercel.app/ for frontend applicaation";
  }
  
}
