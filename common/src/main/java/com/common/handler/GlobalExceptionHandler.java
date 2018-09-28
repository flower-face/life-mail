package com.common.handler;

import com.common.base.BaseResult;
import com.common.consts.CommonConst;
import com.common.exception.ParamException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by tao.zeng on 2018/9/23.
 */
@Slf4j
@ResponseBody
@RestControllerAdvice
public class GlobalExceptionHandler implements CommonConst, BaseResult {

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public Object exceptionHandler(Exception exception) {
        log.error("【异常】", exception);
        if (exception instanceof ParamException) {
            ParamException ex = (ParamException) exception;
            return failure(ex.getCode(), ex.getMessage());
        }
        return failure(exception.getMessage());
    }
}
