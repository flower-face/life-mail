package com.zz.mail.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zz.mail.dto.MailDTO;
import com.zz.mail.entity.MailInfoEntity;
import org.springframework.stereotype.Service;

/**
 * Created by tao.zeng on 2018/9/21.
 * <p>
 * https://gitbook.cn/books/5b99d1111086eb5450229395/index.html
 */
@Service
public interface MailService extends IService<MailInfoEntity> {

    /**
     * 发送文本邮件
     *
     * @param mail 邮件对象
     */
    void sendSimpleMail(MailDTO mail);

    void sendHtmlMail(String to, String subject, String content);

    void sendAttachmentsMail(String to, String subject, String content, String filePath);

    void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
