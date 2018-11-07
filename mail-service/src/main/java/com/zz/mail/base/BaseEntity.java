package com.zz.mail.base;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zz.cloud.core.util.IdHelper;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * Created by tao.zeng on 2018/11/3.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class BaseEntity<T extends BaseEntity> extends Model<T> implements Serializable, Cloneable {

    /**
     * 主键
     */
    private long id;

    /**
     * 创建时间
     */
    @JsonIgnore
    @TableField(exist = false)
    private long created;

    /**
     * 更新时间
     */
    @JsonIgnore
    @TableField(exist = false)
    private long updated;

    /**
     * 创建人
     */
    @JsonIgnore
    @TableField(exist = false)
    private long createBy;

    /**
     * 更新人
     */
    @JsonIgnore
    @TableField(exist = false)
    private long updateBy;

    /**
     * 是否删除标记
     */
    @JsonIgnore
    @TableField(exist = false)
    private boolean deleted;

    public void before() {
        this.id = IdHelper.id();
        this.created = System.currentTimeMillis();
        this.updated = created;
    }
}
