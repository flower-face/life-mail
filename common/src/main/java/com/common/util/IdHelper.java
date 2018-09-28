package com.common.util;

import java.util.UUID;

/**
 * Created by tao.zeng on 2018/9/23.
 */
public class IdHelper {

    private final static Snowflake SNOWFLAKE = new Snowflake(0);

    public static Long id() {
        return SNOWFLAKE.next();
    }

    public static String uuid() {
        return UUID.randomUUID().toString().toLowerCase().replace("-", "");
    }
}
