package com.xiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author：Yerik Xiang
 * @Date：2021/5/19 17:52
 * @Desc：
 */
@Controller
public class MyController {

    @RequestMapping({"/", "index"})
    public String toIndex(Model model) {
        model.addAttribute("msg", "Hello, Shiro");
        return "index";
    }
}
