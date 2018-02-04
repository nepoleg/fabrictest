package com.oyn.fabricTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, path="/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, world";
    }
}
