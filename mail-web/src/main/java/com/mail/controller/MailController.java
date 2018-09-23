package com.mail.controller;

import com.common.base.BaseResult;
import com.common.exception.ParamException;
import com.common.wrapper.ResponseWrapper;
import com.mail.core.service.MailService;
import com.mail.mapper.MailInfoMapper;
import com.mail.model.MailInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tao.zeng on 2018/9/21.
 */
@RestController
@RequestMapping("/api")
public class MailController implements BaseResult {

    @Autowired
    private MailService mailService;

    @Autowired
    private MailInfoMapper mailInfoMapper;

    @RequestMapping("/")
    public ResponseWrapper list(){
        return successful(mailInfoMapper.selectList(null));
    }

    @RequestMapping("/sendSimple")
    public ResponseWrapper sendMail(String to, String subject, String content) {

        if (content == null) {
            throw new ParamException();
        }

        mailService.sendSimpleMail(to, subject, content);
        MailInfo info = new MailInfo();
        info.preInsert();
        info.setReceiver(to);
        info.setMailContent(content);
        info.setMailSubject(subject);
        mailInfoMapper.insert(info);
        return successful();
    }
}
