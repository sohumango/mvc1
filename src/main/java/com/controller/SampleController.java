package main.java.com.controller;

import java.util.Date;

import com.sun.tracing.dtrace.ModuleAttributes;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class SampleController {

    @RequestMapping(value = "/hello", method = GET)
    public String hello(Model model) {
        System.out.println("#############hello method#############");
        Date date = new Date();
        model.addAttribute("svrTime", date);
        // jspのファイル名
        return "test";
    }
}