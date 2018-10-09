package com.zz.mail.service;

import org.springframework.stereotype.Service;

/**
 * Created by tao.zeng on 2018/9/21.
 * <p>
 * https://gitbook.cn/books/5b99d1111086eb5450229395/index.html
 */
@Service
public interface MailService {

    void sendSimpleMail(String to, String subject, String content);

    void sendHtmlMail(String to, String subject, String content);

    void sendAttachmentsMail(String to, String subject, String content, String filePath);

    void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
