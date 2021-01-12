package com.baizhi.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private String id;
    private String nickname;
    private String password;
    private String salt;
    private String headimg;
    private Date registerdate;
    private Date lastlogindate;
    private int count;

}
