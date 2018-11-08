package com.zz.mail.enums;

import lombok.Getter;

/**
 * Created by tao.zeng on 2018/11/8.
 */
@Getter
public enum MailEnum {

    SAMPLE("sample", "简单邮件"),
    MIME("mime", "富文本邮件"),
    ATTACHMENT("attachment", "带附件邮件"),
    INLINE("inline", "带静态资源邮件");

    private String key;

    private String desc;

    MailEnum(String key, String desc) {
        this.key = key;
        this.desc = desc;
    }
}
