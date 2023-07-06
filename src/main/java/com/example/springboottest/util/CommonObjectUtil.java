package com.example.springboottest.util;

import cn.hutool.core.bean.BeanUtil;

public class CommonObjectUtil {

    /**
     * 对象拷贝
     * @param obj 拷贝对象
     * @param clazz 目标类
     * @return 目标类对象
     * @param <T> 泛型
     */
    public static <T> T copyPropertyToBean(Object obj, Class<T> clazz) {
        return BeanUtil.copyProperties(obj, clazz);
    }
}
