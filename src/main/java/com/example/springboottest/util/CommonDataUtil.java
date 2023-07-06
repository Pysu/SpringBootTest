package com.example.springboottest.util;

import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.StrUtil;

public class CommonDataUtil {

    public static boolean strIsNotBlank(String str) {
        return StrUtil.isNotBlank(str);
    }

    public static boolean objIsNotNull(Object obj) {
        return ObjUtil.isNotNull(obj);
    }
}
