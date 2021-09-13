package com.example.platshop.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    /**
     * root
     *
     * @param request
     * @return
     */
    public ModelAndView root(HttpServletRequest request) {

        ModelAndView mav = new ModelAndView("/index");

        return mav;

    }

}