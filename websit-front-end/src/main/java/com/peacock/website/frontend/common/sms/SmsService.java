package com.peacock.website.frontend.common.sms;

import org.joda.time.DateTime;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * @Author: kelvin
 * @Description
 * @Date: created in 下午6:30 2018/7/1
 * @Modified By:
 **/
public interface SmsService {

    void sendSms(String mobile,String content);
    void sendSms();

}
