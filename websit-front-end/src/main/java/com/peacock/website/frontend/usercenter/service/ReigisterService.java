package com.peacock.website.frontend.usercenter.service;

import com.peacock.website.frontend.common.verification.MobileVerificationService;
import com.peacock.website.frontend.exceptions.PeacockException;
import com.peacock.website.frontend.exceptions.RegisterException;
import com.peacock.website.frontend.usercenter.domain.User;
import com.peacock.website.frontend.usercenter.domain.UserAuth;
import com.peacock.website.frontend.usercenter.formbean.RegisterForm;
import com.peacock.website.frontend.usercenter.mapper.UserAuthMapper;
import com.peacock.website.frontend.usercenter.mapper.UserMapper;
import com.peacock.website.frontend.util.NetworkUtils;
import com.peacock.website.frontend.util.PeacockUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;


/**
 * @Author: Kelvin Yeung
 * @Description 用户注册服务可以使用手机、邮箱注册；
 *              1.手机注册，手机验证码验证；
 *              3.邮箱注册，邮箱验证
 * @Date: created in
 * @Modified By:
 **/
@Component
public class ReigisterService {

    public static final int AUTH_TYPE_MOBILE = 1;
    public static final int AUTH_TYPE_EMAIL = 2;
    public static final int AUTH_TYPE_WECHAT = 3;
    public static final int AUTH_TYPE_QQ=4;
    public static final int AUTH_TYPE_SINA = 5;

    @Autowired
    MobileVerificationService  mobileVerificationService;

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserAuthMapper userAuthMapper;

    public void registerWithMobile(RegisterForm form, HttpServletRequest request){

        String mobile = form.getMobile();
        String verifyCode = form.getVerifyCode();
        String password = form.getPassword();
        if(StringUtils.isBlank(mobile)){
            throw new PeacockException("手机号码不能为空");
        }
        if(!PeacockUtils.isMobilePhoneNo(mobile)){
            throw new PeacockException("请输入正确的手机号码");
        }
        if(StringUtils.isBlank(verifyCode)){
            throw new PeacockException("短信验证码不能为空");
        }
        if(StringUtils.isBlank(password)){
            throw new PeacockException("密码不能为空格");
        }
        if(PeacockUtils.isValidPassword(password)){
            throw new PeacockException("密码至少为6位！");
        }

        //验证短信验证码
        boolean isVerified = mobileVerificationService.verify(mobile,verifyCode);
        if(!isVerified){
            throw new PeacockException("短信验证码不正确");
        }


        User user = new User();
        UserAuth userAuth = new UserAuth();
        String userId = PeacockUtils.getUUID();
        String userAuthId = PeacockUtils.getUUID();
        user.setId(userId);
        userAuth.setId(userAuthId);
        userAuth.setIdentifier(mobile);
        userAuth.setCredential(password);
        userAuth.setIdentifyType("mobile");
        userAuth.setLastIp(NetworkUtils.getIpAddress(request));
        userAuth.setVerified(1);


        //保存数据库
        userMapper.insert(user);
        userAuthMapper.insert(userAuth);

    }


    public void registerWithEmail(RegisterForm form){
        String email = form.getEmail();
        String password = form.getPassword();

        if(StringUtils.isBlank(email)){
            throw new RegisterException("邮箱不能为空！");
        }
        if(PeacockUtils.isEmail(email)){
            throw new RegisterException("邮臬不正确！");
        }
        if(PeacockUtils.isValidPassword(password)){
            throw new RegisterException("密码不正确！");
        }

        //TODO:发送验证邮件
        //String verity
        User user = new User();
        UserAuth userAuth = new UserAuth();
        String userId = PeacockUtils.getUUID();
        user.setId(userId);
        String userAuthId = PeacockUtils.getUUID();
        userAuth.setId(userAuthId);
        userAuth.setIdentifier(email);
        userAuth.setCredential(password);
        userAuth.setIdentifyType(AUTH_TYPE_EMAIL);
        userAuth.setVerified(2);//未验证

        userMapper.insert(user);
        userAuthMapper.insert(userAuth);


    }


    public void verifyEmail(String verifyStr){




    }


}
