package info.example.restcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
@Controller

public class J {
    @RequestMapping(value = "/index")
    public String getIndex(){

        return "index";
    }
}
