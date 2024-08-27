package app.nebula.java_worker_demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

@Component
@org.aspectj.lang.annotation.Aspect
public class Aspect {

    @Around("@annotation(app.nebula.java_worker_demo.Idempotent)")
    public Object log(ProceedingJoinPoint joinPoint) throws  Throwable{
        System.out.println("print in aop");
        return joinPoint.proceed();
    }

}
