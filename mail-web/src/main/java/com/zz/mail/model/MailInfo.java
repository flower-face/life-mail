package com.zz.mail.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by tao.zeng on 2018/9/23.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("mail_info")
@EqualsAndHashCode(callSuper = true)
public class MailInfo extends BaseEntity {

    private String receiver;

    @TableField("mail_subject")
    private String mailSubject;

    @TableField("mail_content")
    private String mailContent;

    @TableField("file_path")
    private String filePath;
}
