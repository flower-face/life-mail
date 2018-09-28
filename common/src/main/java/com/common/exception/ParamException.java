package com.common.exception;

import com.common.consts.CommonConst;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by tao.zeng on 2018/9/23.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ParamException extends RuntimeException implements CommonConst {

    private int code;

    public ParamException() {
        super(MESSAGE_PARAM_FAILURE);
        this.code = CODE_PARAM_FAILURE;
    }

    public ParamException(int code, String message) {
        super(message);
        this.code = code;
    }
}
