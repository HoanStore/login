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
        ModelAndView mv = new ModelAndView("contents/login/login");
        return mv;
    }


    @GetMapping(value = {"/", "/index", "/main"})
    public ModelAndView main() {
        log.info("Hello Main");
        log.error("Error인 경우에는 출력!");
        ModelAndView mv = new ModelAndView("contents/main/main");
        return mv;
    }

    @GetMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("contents/main/hello");
        return mv;
    }
}
