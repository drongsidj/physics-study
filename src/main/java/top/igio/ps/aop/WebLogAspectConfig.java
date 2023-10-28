package top.igio.ps.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author ljl
 * @version V1.0
 * @data 2023/10/10 21:26
 * @description
 */
@Aspect
@Component
public class WebLogAspectConfig {

    private static final Logger logger = LoggerFactory.getLogger(WebLogAspectConfig.class);

    @Pointcut("execution(public * top.igio.ps.controller..*.*(..))")
    public void controllerLog() {
    }

    @Before("controllerLog()")
    public void logBeforeController(JoinPoint joinPoint) {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();

        logger.info("接口的请求URL为: {}, 请求方式为: {}, 请求方法为: {}, 请求参数: {}",
                request.getRequestURL(),
                request.getMethod(),
                joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName(),
                Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "ret", pointcut = "controllerLog()")
    public void doAfterReturning(Object ret) {
        logger.info("返回值为: {}", ret);
    }
}
