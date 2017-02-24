package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

    @RequestMapping("/err404")
    public String err404() {
        return "err404";
    }

    @RequestMapping("/err")
    public String err() {
        return "validationErr";
    }

    @RequestMapping("/badRequest")
    public String otherErr() {
        return "errRequest";
    }

    @RequestMapping("/noConnect")
    public String noBaseConnection() {
        return "noConnect";
    }
}
