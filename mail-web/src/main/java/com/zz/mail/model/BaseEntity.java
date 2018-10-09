package com.zz.mail.model;

import com.zz.common.util.IdHelper;
import lombok.Data;

import java.util.Date;

/**
 * Created by tao.zeng on 2018/9/23.
 */
@Data
public class BaseEntity {

    private long id;

    private Date created;

    private Date updated;

    public void preInsert() {
        this.id = IdHelper.id();
        this.created = new Date();
        this.updated = created;
    }
}
