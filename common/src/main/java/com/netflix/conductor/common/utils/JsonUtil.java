package com.netflix.conductor.common.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.bval.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class JsonUtil {
    /**
     * 将一个json字符串转java对象
     *
     * @param jsonStr
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T jsonStrToJavaBean(String jsonStr, Class<T> tClass) {
        if(jsonStr==null|| StringUtils.isBlank(jsonStr)){
            return null;
        }
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        return jsonObject.toJavaObject(tClass);

    }

    public static <T> List<T> jsonStrToJavaBean(List<String> jsonStrList, Class<T> tClass) {
        List<T> list = new ArrayList<>();
        jsonStrList.forEach(json -> {
            list.add(jsonStrToJavaBean(json, tClass));
        });
        return list;
    }
}
