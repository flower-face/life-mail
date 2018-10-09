package com.zz.common.exception;

import com.zz.common.enums.StatusCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by tao.zeng on 2018/9/23.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ParamException extends RuntimeException {

    private int code;

    public ParamException() {
        super(StatusCode.CODE_400.getMessage());
        this.code = StatusCode.CODE_400.getCode();
    }

    public ParamException(int code, String message) {
        super(message);
        this.code = code;
    }
}
