package com.algaworks.algafood0.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

  public void printNotification() {

  }

  @GetMapping("/hello")
  @ResponseBody
  public String hello() {
    return "Hello World!";
  }

  @GetMapping("/hello/{name}")
  @ResponseBody
  public String hello(@PathVariable("name") String name) {
    return "Hello " + name + "!";
  }
}
