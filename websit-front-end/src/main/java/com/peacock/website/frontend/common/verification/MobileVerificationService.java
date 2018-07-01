package com.peacock.website.frontend.common.verification;

import com.peacock.website.frontend.common.sms.SmsService;
import com.peacock.website.frontend.exceptions.PeacockException;
import com.peacock.website.frontend.util.PeacockUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @Author: kelvin
 * @Description
 * @Date: created in 下午6:21 2018/7/1
 * @Modified By:
 **/
@Component
public class MobileVerificationService {

    @Autowired
    SmsService smsService;

    public void sendVerifyCode(String mobile){
        if(StringUtils.isBlank(mobile)
                || PeacockUtils.isMobilePhoneNo(mobile)){
            throw new PeacockException("请输入正确的手机号码");
        }

        String code = PeacockUtils.makeVerifyCode();
        //保存在Cache中
        cacheVerifyCode(mobile,code);
        //TODO:send verifyCode
        smsService.sendSms(mobile,code);

    }

    /**
     * 验证验证码
     * @param
     * @return
     */
    public boolean verify(String mobile ,String code) {

        return false;
    }


    public void cacheVerifyCode(String mobile,String code){

    }
    @Cacheable("verification.phone.verfiyCode")
    public String getVerifyCode(String mobile){
        String code = null;
        return code;
    }
}
