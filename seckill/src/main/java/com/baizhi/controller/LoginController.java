package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.secondkill.util.ResponseBean;
import com.baizhi.service.LogonService;

import com.baizhi.vo.LoginVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
//session
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
    public ResponseBean Login(@Valid LoginVo loginVo){
        log.info("{}{}{}","登录用户的账号与密码：",loginVo.getMobile(),loginVo.getPassword());
        //捕获异常，编译时异常 运行时异常
        return logonService.login(loginVo.getMobile(),loginVo.getPassword());
    }

}
