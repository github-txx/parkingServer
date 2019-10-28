package com.example.parkingserver.util;

import java.util.UUID;

/**
 * UUID生成器
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-28 15:31
 * @param
 * @return
 */
public class UUIDUtil {
    public static String randomUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
