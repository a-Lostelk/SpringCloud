package com.sunny.common;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
 * @Author: Sunny
 * @Date: 2020/2/18
 * @Created by: IntelliJ idea
 * @Description: JSON工具类
 */
public class JsonUtil {

    /**
     * 将对象转换为JSON对象
     * @param obj
     * @return
     */
    public String toJson(Object obj) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.toJson(obj);
    }

    /**
     * 字符串转为JSON对象
     * @param str
     * @param type
     * @param <T>
     * @return
     */
    public <T> T fromJson(String str, Type type) {
        Gson gson = new Gson();
        return gson.fromJson(str, type);
    }
}
