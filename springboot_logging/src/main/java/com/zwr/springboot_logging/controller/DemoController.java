package com.zwr.springboot_logging.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        log.info("执行了hello方法");
        return "hello";
    }
}
