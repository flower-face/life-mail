package com.zz.mail.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.cloud.core.persistent.mybatisplus.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author tao.zeng
 * @since 2018-11-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("mail_info")
public class MailInfoEntity extends BaseEntity<MailInfoEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 接收者
     */
    @TableField("receiver")
    private String receiver;

    /**
     * 邮件主题
     */
    @TableField("subject")
    private String subject;

    /**
     * 邮件内容
     */
    @TableField("content")
    private String content;

    /**
     * 邮件类型，sample、html、attachments、resource
     *
     * @see com.zz.mail.enums.MailEnum
     */
    @TableField("classify")
    private String classify;

    @TableField(exist = false)
    private List<MailAttachmentEntity> attachments;
}
