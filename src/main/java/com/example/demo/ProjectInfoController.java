package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProjectInfoController {
    @GetMapping("/basicinfo")
  public String basicinfo(){
        return "basicinfo";
    }

  @GetMapping("/getattr")
  public String getAttribute(Model model,
                             @RequestParam(name="attribute", required = false)String attribute){

      if (attribute.equals("version")){
          model.addAttribute("attribute", "1.0");
        } else if (attribute.equals("language")){
          model.addAttribute("attribute", "Java");
      } else {
          model.addAttribute("attribute", "None");
      }
      return "getattr";
  }
}

// http://localhost:8080/getattr?attribute=version