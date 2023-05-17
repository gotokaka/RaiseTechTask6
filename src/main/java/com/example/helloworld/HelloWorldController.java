package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloWorldController {
  @GetMapping("/current-datetime")
  public static String nowTime() {
    LocalDateTime nowTime = LocalDateTime.now();
    DateTimeFormatter formattingTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mmです");
    String formattedTime = formattingTime.format(nowTime);
    return "Hello World!! 現在日時は" + formattedTime;
  }

  @GetMapping("/hello")
  public String hello(@RequestParam(value = "name", defaultValue = "kakapo") String name) {
    return String.format("<h1>Hello %s!</h1>", name);
  }
}
