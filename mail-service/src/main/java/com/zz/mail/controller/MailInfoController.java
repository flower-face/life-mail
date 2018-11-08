package com.zz.mail.controller;

import com.zz.cloud.core.wrapper.ResponseWrapper;
import com.zz.mail.base.BaseController;
import com.zz.mail.dto.MailDTO;
import com.zz.mail.entity.MailInfoEntity;
import com.zz.mail.enums.MailEnum;
import com.zz.mail.mapper.MailInfoMapper;
import com.zz.mail.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by tao.zeng on 2018/9/21.
 */
@RestController
@RequestMapping("/mail")
public class MailInfoController extends BaseController {

    @Autowired
    private MailService mailService;

    @Autowired
    private MailInfoMapper mailInfoMapper;

    @PostMapping("/send-sample")
    public ResponseWrapper sendSampleMail(@RequestBody MailDTO mail) {
        mail.setClassify(MailEnum.SAMPLE.getKey());
        mailService.sendSimpleMail(mail);
        return successful();
    }

    @DeleteMapping("/{id}")
    public ResponseWrapper delById(@PathVariable("id") long id) {
        MailInfoEntity entity = mailInfoMapper.selectById(id);
        entity.setUpdated(System.currentTimeMillis());
        entity.setDeleted(true);
        int i = mailInfoMapper.updateById(entity);
        return successful(i > 0);
    }
}
