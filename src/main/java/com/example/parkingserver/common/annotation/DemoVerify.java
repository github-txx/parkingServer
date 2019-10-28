package com.example.parkingserver.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * Demo注解定义
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-28 15:47
 * @param
 * @return
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DemoVerify {
}
