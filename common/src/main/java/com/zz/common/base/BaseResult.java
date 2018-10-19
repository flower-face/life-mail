package com.zz.common.base;

import com.zz.common.enums.StatusCode;
import com.zz.common.wrapper.ResponseWrapper;

/**
 * Created by tao.zeng on 2018/9/22.
 */
public interface BaseResult {

    StatusCode CODE_200 = StatusCode.CODE_200,
            CODE_400 = StatusCode.CODE_400,
            CODE_404 = StatusCode.CODE_404,
            CODE_500 = StatusCode.CODE_500;

    default ResponseWrapper<Object> result(int code, String message, Object data) {
        return ResponseWrapper.builder().code(code).message(message).data(data).build();
    }

    default ResponseWrapper<Object> successful() {
        return successful(null);
    }

    default ResponseWrapper<Object> successful(Object data) {
        return result(CODE_200.getCode(), CODE_200.getMessage(), data);
    }

    default ResponseWrapper<Object> successful(int code, String message) {
        return result(code, message, null);
    }

    default ResponseWrapper<Object> failure() {
        return failure(CODE_500.getMessage());
    }

    default ResponseWrapper<Object> failure(String message) {
        return failure(CODE_500.getCode(), message);
    }

    default ResponseWrapper<Object> failure(int code, String message) {
        return result(code, message, null);
    }
}
