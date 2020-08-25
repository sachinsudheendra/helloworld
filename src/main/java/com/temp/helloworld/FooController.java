package com.temp.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FooController {

  @GetMapping("/foo")
  public String foo() {
    return "Hello World";
  }
}
