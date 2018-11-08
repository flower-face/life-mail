package com.zz.mail.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zz.cloud.core.persistent.mybatisplus.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author tao.zeng
 * @since 2018-11-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("mail_attachment")
public class MailAttachmentEntity extends BaseEntity<MailAttachmentEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * 附件名称
     */
    @TableField("file_name")
    private String fileName;

    /**
     * 附件地址
     */
    @TableField("file_path")
    private String filePath;

    /**
     * 附件大小
     */
    @TableField("file_size")
    private Long fileSize;

    /**
     * 邮件id
     */
    @TableField("mail_id")
    private Long mailId;


    @TableField(exist = false)
    private MailInfoEntity mailInfo;
}
