package com.arcvideo.iface.zookeeper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author bc
 */
@Controller
public class HomeController {


  @GetMapping(value = "/home")
  public String toHome() {
    return "home";
  }


}
