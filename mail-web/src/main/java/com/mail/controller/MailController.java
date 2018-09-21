package com.mail.controller;

import com.mail.core.service.MailService;
import com.mail.core.wrapper.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tao.zeng on 2018/9/21.
 */
@RestController
@RequestMapping("/api")
public class MailController {

    @Autowired
    private MailService mailService;

    @RequestMapping("/sendSimple")
    public ResponseWrapper sendMail(String to, String subject, String content) {
        mailService.sendSimpleMail(to, subject, content);
        return ResponseWrapper.builder().code(200).message("successful").build();
    }
}
