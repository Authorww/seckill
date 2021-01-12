package com.baizhi.service;


import com.baizhi.entity.User;
import com.baizhi.secondkill.util.ResponseBean;

public interface LogonService {
    ResponseBean login(String nikname, String password);
}
