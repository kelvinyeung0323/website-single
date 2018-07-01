package com.peacock.website.frontend.usercenter.formbean;

/**
 * @Author: kelvin
 * @Description
 * @Date: created in 下午2:56 2018/7/1
 * @Modified By:
 **/
public class RegisterForm {

    /**移动电话**/
    private String mobile;
    /**电子邮箱**/
    private String email;
    /**密码**/
    private String password;
    /**验证码**/
    private String captcha;
    /**短信验证码**/
    private String verifyCode;


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}
