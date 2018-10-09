package com.zz.common.enums;

import lombok.Getter;

/**
 * Created by tao.zeng on 2018/10/9.
 */
@Getter
public enum StatusCode {

    CODE_200(200, "successful!"),
    CODE_400(400, "param failure."),
    CODE_404(404, "resources not found."),
    CODE_500(500, "server failure.");

    private int code;

    private String message;

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
