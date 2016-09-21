package org.ssa.ironyard.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/microservice")
public class Home
{
    @RequestMapping(value = "/")
    public String home()
    {
        return "/index.html";
    }

}
