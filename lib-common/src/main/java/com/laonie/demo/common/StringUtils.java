package com.laonie.demo.common;

/**
 * Created by niejiuqian on 2017/9/11.
 */
public class StringUtils {
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
