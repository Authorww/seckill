package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.secondkill.util.ResponseBean;
import com.baizhi.service.LogonService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {
    @Autowired
    LogonService logonService;
    @RequestMapping("/login")
    public String Login(Model model){
        //首先进行页面跳转
        return "logon";
    }
    @RequestMapping("/doLogin")
    @ResponseBody
    public ResponseBean Login(String mobile, String password){
        log.info("{}{}{}","登录用户的账号与密码：",mobile,password);
        return logonService.login(mobile, password);
    }

}
