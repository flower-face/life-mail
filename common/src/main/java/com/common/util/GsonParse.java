package com.common.util;

import com.common.gson.deserializer.DateDeserializer;
import com.common.gson.serializer.DateSerializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;
import java.util.Date;

/**
 * Created by tao.zeng on 2018/9/23.
 */
public class GsonParse {

    public static GsonBuilder DATE_LONG_BUILDER = new GsonBuilder()
            .registerTypeAdapter(Date.class, new DateSerializer())
            .registerTypeAdapter(Date.class, new DateDeserializer());

    public static String toJson(Object data) {
        return new Gson().toJson(data);
    }

    public static String toJson(GsonBuilder builder, Object data) {
        return builder.create().toJson(data);
    }

    public static String toDateLongJson(Object data) {
        return toJson(DATE_LONG_BUILDER, data);
    }

    public static <T> T parse(String json, Class<T> clz) {
        return new Gson().fromJson(json, clz);
    }

    public static <T> T parse(String json, Type type) {
        return new Gson().fromJson(json, type);
    }

    public static <T> T parse(GsonBuilder builder, String json, Class<T> clz) {
        return builder.create().fromJson(json, clz);
    }

    public static <T> T parse(GsonBuilder builder, String json, Type type) {
        return builder.create().fromJson(json, type);
    }

    public static <T> T parseDateLong(String json, Class<T> clz) {
        return parse(DATE_LONG_BUILDER, json, clz);
    }

    public static <T> T parseDateLong(String json, Type type) {
        return parse(DATE_LONG_BUILDER, json, type);
    }
}
