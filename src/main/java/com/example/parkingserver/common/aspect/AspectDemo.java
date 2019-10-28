package com.example.parkingserver.common.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Demo注解切面实现
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-28 15:47
 * @param
 * @return
 */
@Component
@Aspect
public class AspectDemo {

    @Pointcut("@within(com.example.parkingserver.common.annotation.DemoVerify)")
    public void classPointCut() {
    }

    @Pointcut("@annotation(com.example.parkingserver.common.annotation.DemoVerify)")
    public void methodPointCut() {
    }

    /**
     * 切入点
     *
     * @author zhouszxfs@xinfushe.com
     * @date 2019-10-28 15:48
     * @param joinPoint
     * @return java.lang.Object
     */
    @Around("classPointCut() || methodPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        // 业务功能实现
        return null;
    }
}
