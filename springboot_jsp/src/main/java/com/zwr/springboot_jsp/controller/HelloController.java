package com.zwr.springboot_jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HelloController {
    /**
     * 如果main 方法所在的项目是maven顶级项目，则用main方法运行，可以访问jsp
     *
     * 如果main方法所在的项目是maven的子模块项目（如 Main-Parent项目中，
     * 包含maven-A子模块，正好main方法就在maven-A 模块中）则main方法运行，无法访问jsp
     * 需要使用//spring-boot:run方式启动
     */
    @GetMapping("/abc")
    public String hello(Model model){
        model.addAttribute("msg","你好");
        return "success";
    }
}
