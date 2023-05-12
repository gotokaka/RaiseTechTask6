package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
  @GetMapping("/hello")
  public String hello(@RequestParam(value = "name", defaultValue = "kakapo") String name) {
    return String.format("<h1>Hello %s!</h1>", name);
  }
}
