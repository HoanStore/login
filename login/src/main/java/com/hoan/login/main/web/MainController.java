package com.hoan.login.main.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class MainController {

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("contents/login/login");
    }


    @GetMapping(value = {"/", "/index", "/main"})
    public ModelAndView main() {
        return new ModelAndView("contents/main/main");
    }

    @GetMapping("/hello")
    public ModelAndView hello() {
        return new ModelAndView("contents/main/hello");
    }
}
