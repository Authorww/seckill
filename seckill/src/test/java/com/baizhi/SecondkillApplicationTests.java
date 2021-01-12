package com.baizhi;

import com.baizhi.mapper.LogonDao;
import com.baizhi.entity.User;
import com.xxxx.secondkill.util.MD5Utils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SecondkillApplicationTests {
    @Autowired
    private LogonDao loginDao;
    @Test
   public void test1() {
        System.out.println(loginDao);
        User user = loginDao.login("18619240450");
        System.out.println(user.getHeadimg());
        String s = MD5Utils.toFormatPassword("123456");
        log.info("{}",s);
    }
}
