package top.igio.ps.aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.lang.reflect.Method;

/**
 * @author ljl
 * @version V1.0
 * @data 2023/9/25 22:00
 * @description
 */
@Aspect
@Component
public class LogSetter {
    private static final Logger logger = LoggerFactory.getLogger(LogSetter.class);

    @Pointcut("within(top.igio.ps.controller..*) && " + "@annotation(org.springframework.web.bind.annotation.GetMapping) || " +
            "@annotation(org.springframework.web.bind.annotation.PostMapping) || " +
            "@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    private void Mapping() {}

    @Around("Mapping()")
    public Object testMappingLog(ProceedingJoinPoint joinPoint )throws Throwable {
        // 获取描述和URI
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
        if (requestMapping != null) {
            logger.info("RequestMapping的URI: {}", requestMapping.value());
            logger.info("RequestMapping的描述: {}", requestMapping.name());
        }

        // Check for @GetMapping
        GetMapping getMapping = method.getAnnotation(GetMapping.class);
        if (getMapping != null) {
            logger.info("GetMapping的URI: {}", getMapping.value());
            logger.info("GetMapping的描述: {}", getMapping.name());
        }

        // Check for @PostMapping
        PostMapping postMapping = method.getAnnotation(PostMapping.class);
        if (postMapping != null) {
            logger.info("PostMapping的URI: {}", postMapping.value());
            logger.info("PostMapping的描述: {}", postMapping.name());
        }

        Object[] args = joinPoint.getArgs();
        String params = null;
        if (args.length > 0) {
            for (Object obj : args) {
                if (obj instanceof HttpServletRequest) {
                    continue;
                }
                params = args[0].toString();
            }
        }
        Object proceed  = joinPoint.proceed();
        return proceed;
    }

}
