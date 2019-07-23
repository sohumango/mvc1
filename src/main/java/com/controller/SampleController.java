package main.java.com.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping(value = "/hello", method = GET)
    public String hello() {
        System.out.println("#############hello method#############");
        // jspのファイル名
        return "test";
    }
}