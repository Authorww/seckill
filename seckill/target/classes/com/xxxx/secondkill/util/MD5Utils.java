package com.xxxx.secondkill.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * MD5 工具类
 */

public class MD5Utils {
    private static String salts = "1a2b3c4d";
    //加密
    public static String md5(String src){
        return DigestUtils.md5Hex(src);
    }
    //第一次加密
    public static String toFormatPassword(String formpassword){
        String src = ""+salts.charAt(0)+salts.charAt(2)+formpassword+salts.charAt(5)+salts.charAt(4);
        return md5(src);
    }

    //第二次加密
    public static String inputPassToDbPass(String formpassword,String salt){
        String src = ""+salts.charAt(0)+salts.charAt(2)+formpassword+salts.charAt(5)+salts.charAt(4);
        return md5(src);
    }

//    public static void main(String[] args) {
//        String password = toFormatPassword("123456");
//        String s = inputPassToDbPass("d3b1294a61a07da9b49b6e22b2cbd7f9", salts);
//        System.out.println(password);
//        System.out.println("12345645");
//        System.out.println(s);
//    }
}
