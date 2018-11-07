package com.zz.mail.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.mail.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
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
    @TableField("mail_subject")
    private String mailSubject;

    /**
     * 邮件内容
     */
    @TableField("mail_content")
    private String mailContent;

    /**
     * 附件地址
     */
    @TableField("file_path")
    private String filePath;


    @Override
    protected Serializable pkVal() {
        return getId();
    }

}
