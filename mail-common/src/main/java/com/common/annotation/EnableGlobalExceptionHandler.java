package com.common.annotation;

import com.common.handler.GlobalExceptionHandler;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by tao.zeng on 2018/9/23.
 */
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(value = {GlobalExceptionHandler.class})
public @interface EnableGlobalExceptionHandler {
}
