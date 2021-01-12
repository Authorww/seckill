package com.baizhi.serviceimpl;


import com.baizhi.mapper.LogonDao;
import com.baizhi.entity.User;
import com.baizhi.secondkill.util.CommonPara;
import com.baizhi.secondkill.util.ResponseBean;
import com.baizhi.service.LogonService;
import com.xxxx.secondkill.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class LogonServiceImpl implements LogonService {
    @Autowired
    private LogonDao loginDao;

    @Override
    public ResponseBean login(String phonenum, String password) {
        //对手机号与密码加上校验
        if(StringUtils.isEmpty(password)){
            return new ResponseBean(CommonPara.MOBILE_ERROR.getCode(),CommonPara.MOBILE_ERROR.getMessage(),null);
        }
        if(StringUtils.isEmpty(password)){
            return new ResponseBean(CommonPara.PSSQWORD_ERROR.getCode(),CommonPara.PSSQWORD_ERROR.getMessage(),null);
        }
        //参数校验 使用spring-boot-starter-validation  参数校验

        User user = loginDao.login(phonenum);
        if (null == user){
            return new ResponseBean(CommonPara.LOGINVO_ERROR.getCode(),CommonPara.LOGINVO_ERROR.getMessage(),null);
        }
        String toFormatPassword = MD5Utils.toFormatPassword(password);
        if(!user.getPassword().equals(toFormatPassword)){
            return new ResponseBean(CommonPara.LOGINVO_ERROR.getCode(),CommonPara.LOGINVO_ERROR.getMessage(),null);
        }
        return new ResponseBean(CommonPara.SUCCESS.getCode(),CommonPara.SUCCESS.getMessage(),user);
    }

}
