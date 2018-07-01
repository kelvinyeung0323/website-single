package com.peacock.website.frontend.common.email;

import com.peacock.website.frontend.sys.configuration.domain.SysConfiguration;
import com.peacock.website.frontend.sys.configuration.service.SysConfigurationService;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @Author: kelvin
 * @Description
 * @Date: created in 下午1:06 2018/7/1
 * @Modified By:
 **/
public class EmailService {
    public static final String MAIL_HOST="email.host";
    public static final String MAIL_PORT = "email.port";//587
    public static final String MAIL_SEND_FROM = "1231231@qq.com";
    public static final String MAIL_USERNAME = "123123";
    public static final String MAIL_PASSWORD = "1231";
    public static final String MAIL_SMTP_AUTH ="true";
    public static final String MAIL_SMTP_TIME_OUT ="25000";
    public static final Boolean MAIL_CONTENT_HTML =true;

    @Autowired
    SysConfigurationService configurationService;

    //AuthenticationFailedException
    public void sendEmail(String sendTo,String subject,String content) throws MessagingException {
//        JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();
//        //设定mail server
//        senderImpl.setHost(MAIL_HOST);
//        //建立邮件消息,发送简单邮件和html邮件的区别
//        MimeMessage mailMessage = senderImpl.createMimeMessage();
//        MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage,true,"GBK");
//
//        //设置收件人，寄件人
//        messageHelper.setTo(sendTo);
//        messageHelper.setFrom(MAIL_SEND_FROM);
//        messageHelper.setSubject(subject);
//        //true 表示启动HTML格式的邮件
//        messageHelper.setText(content,MAIL_CONTENT_HTML);
//        senderImpl.setPort(configurationService.getInteger(MAIL_PORT));
//        senderImpl.setUsername(MAIL_USERNAME) ; // 根据自己的情况,设置username
//        senderImpl.setPassword(MAIL_PASSWORD) ; // 根据自己的情况, 设置password
//        Properties prop = new Properties() ;
//        prop.put("mail.smtp.auth",MAIL_SMTP_AUTH) ; // 将这个参数设为true，让服务器进行认证,认证用户名和密码是否正确
//        prop.put("mail.smtp.timeout", MAIL_SMTP_TIME_OUT) ;
//        prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
//        senderImpl.setJavaMailProperties(prop);
//        //发送邮件
//        senderImpl.send(mailMessage);
//
//        System.out.println("邮件发送成功..");

    }
}
