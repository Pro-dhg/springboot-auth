package com.dhg.auth.util;

/**
 * @author: Pro-dhg
 * @date: 2023/08/10 10:16
 */
public class StringTools {

    public static boolean isNullOrEmpty(String str) {
        return null == str || "".equals(str) || "null".equals(str);
    }

    public static boolean isNullOrEmpty(Object obj) {
        return null == obj || "".equals(obj);
    }
}
