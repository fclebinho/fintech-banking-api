package dev.gomes.banking;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Hello {
  @RequestMapping
  public String hello() {
    return "Hello, World!";
  }
}
