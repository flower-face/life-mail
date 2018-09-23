package com.common.base;

import com.common.consts.CommonConst;
import com.common.wrapper.ResponseWrapper;

/**
 * Created by tao.zeng on 2018/9/22.
 */
public interface BaseResult extends CommonConst {

    default ResponseWrapper<Object> result(int code, String message, Object data) {
        return ResponseWrapper.builder().code(code).message(message).data(data).build();
    }

    default ResponseWrapper<Object> successful() {
        return successful(null);
    }

    default ResponseWrapper<Object> successful(Object data) {
        return result(CODE_SUCCESSFUL, MESSAGE_SUCCESSFUL, data);
    }

    default ResponseWrapper<Object> successful(int code, String message) {
        return result(code, message, null);
    }

    default ResponseWrapper<Object> failure() {
        return failure(MESSAGE_FAILURE);
    }

    default ResponseWrapper<Object> failure(String message) {
        return failure(CODE_FAILURE, message);
    }

    default ResponseWrapper<Object> failure(int code, String message) {
        return result(code, message, null);
    }
}
