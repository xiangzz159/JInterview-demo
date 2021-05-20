package com.xiang.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/user/add")
    public String add() {
        System.out.println("user/add");
        return "user/add";
    }

    @RequestMapping("/user/update")
    public String update() {
        System.out.println("user/update");
        return "user/update";
    }

    @RequestMapping("toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(String username, String password, Model model) {
        // 获取当前用户
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        try {
            subject.login(token);   // 执行登录方法，如果没有异常就说明成功
            return "index";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg", "用户名错误");
            return "login";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "密码错误");
            return "login";
        } catch (Exception e) {
            model.addAttribute("msg", "未知错误");
            return "login";
        }
    }

    @RequestMapping("/unauth")
    @ResponseBody
    public String unauth() {
        return "未经授权无法访问此页面";
    }

}
