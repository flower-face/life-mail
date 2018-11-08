package com.zz.mail.dto;

import com.zz.mail.entity.MailAttachmentEntity;
import lombok.Data;
import org.dozer.Mapping;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tao.zeng on 2018/11/8.
 */
@Data
public class MailDTO implements Serializable {

    /**
     * 接收者
     */
    @Mapping("receiver")
    private String to;

    /**
     * 邮件主题
     */
    private String subject;

    /**
     * 邮件内容
     */
    private String content;

    /**
     * 邮件类型，sample、html、attachments、resource
     *
     * @see com.zz.mail.enums.MailEnum
     */
    private String classify;

    private List<MailAttachmentEntity> attachments;
}
