package com.peacock.website.frontend.util;

import org.apache.tomcat.util.buf.StringUtils;

import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: kelvin
 * @Description
 * @Date: created in 下午6:15 2018/7/1
 * @Modified By:
 **/
public class PeacockUtils {

    private static Pattern mobilePhonePattern;
    private static Pattern emailPattern;
    private static Pattern passwordPattern;
    private static Pattern accountPattern;

    static {
        mobilePhonePattern = Pattern.compile("^1[0-9]{10}$");
        emailPattern = Pattern.compile("^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+");

        passwordPattern = Pattern.compile("^[\\w.]{6,18}$");//由字母或数字组成，长度在6~18之间，只能包含字符、数字和下划线

        accountPattern = Pattern.compile("^[\\w|\\.|@|_|-]{1,20}");//2、	只能是数字、字符、中划线、下划线、以及@和小点.
    }


    public static boolean isMobilePhoneNo(String str) {
        Matcher m = mobilePhonePattern.matcher(str);
        return m.matches();
    }

    public static boolean isValidAccount(String str){
        Matcher m = accountPattern.matcher(str);
        return m.matches();
    }
    public static boolean isEmail(String str) {
        Matcher m = emailPattern.matcher(str);
        return m.matches();
    }

    public static boolean isValidPassword(String pwd){
        Matcher m = passwordPattern.matcher(pwd);
        return m.matches();
    }


    public static String makeVerifyCode(){
        String code = String.format("%04d", new Random().nextInt(9999));
        return code;
    }


    public static String genRandomString(int lengh){
        int n = (int) (Math.pow(10,lengh) -1);
        String str = String.format("%0"+lengh+"d",new Random().nextInt(n));
        return str;
    }

    public static String getUUID(){

        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-","");
    }
    public static void main(String[] args){

        System.out.print(getUUID());
    }


}
