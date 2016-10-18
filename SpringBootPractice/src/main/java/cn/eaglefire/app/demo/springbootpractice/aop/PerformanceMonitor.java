package cn.eaglefire.app.demo.springbootpractice.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Performance Monitor
 * 性能监控
 *
 * Created by eagle on 2016/10/18.
 */
@Aspect
@Component
public class PerformanceMonitor {

    @AfterReturning(
            "execution(* cn.eaglefire.app.demo.springbootpractice.controller..*.*(..))" +
            "|| execution(* cn.eaglefire.app.demo.springbootpractice.service..*.*(..))"
    )
    public void logServiceAccess(JoinPoint joinPoint) {
        System.out.println("Completed: " + joinPoint);
    }

}
