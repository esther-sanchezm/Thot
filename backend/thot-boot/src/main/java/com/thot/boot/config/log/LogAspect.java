package com.thot.boot.config.log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Slf4j
@Component
public class LogAspect {

    /**
     * Pointcut that matches in project com.thot
     */
    @Pointcut("execution(public * com.thot..*(..))")
    public void applicantionBeanPointcut() {

    }

    /**
     * Pointcut that matches all repositories, services and Web REST endpoints.
     */
    @Pointcut("within(@org.springframework.stereotype.Repository *)" +
            " || within(@org.springframework.web.bind.annotation.RestController *)")
    public void springBeanPointcut() {

    }

    @Before("applicantionBeanPointcut() && springBeanPointcut()")
    public void logBefore(JoinPoint joinPoint) {

        log.info("Entering class: {}, executing method: {} with args: {}",
                joinPoint.getTarget().getClass().getName(),
                joinPoint.getSignature().getName(),
                ((joinPoint.getArgs() != null && joinPoint.getArgs().length > 0) ? joinPoint.getArgs()[0] : ""));
    }

    @AfterReturning(pointcut = "applicantionBeanPointcut() && springBeanPointcut()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        log.info("In class: {}, exiting method: {} with returned value: {}", joinPoint.getTarget().getClass().getName(),  joinPoint.getSignature().getName(), result);
    }

    @AfterThrowing(pointcut = "springBeanPointcut()", throwing = "exception")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {
        log.error("In class: {}, exception on method: {} exception is: {}", joinPoint.getTarget().getClass().getName(), joinPoint.getSignature().getName(), exception.getMessage());
    }
}

