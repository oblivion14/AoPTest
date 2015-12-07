package logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

/**
 * Created by Melvin on 2015. 12. 3..
 */

@Service
@Aspect
public class Logging {

    @Around("execution(* com.pineone.icbms.so..*.*(..))")

    public Object logAround(ProceedingJoinPoint pjp) throws Throwable{
        String methodName = pjp.getSignature().getName();
        StopWatch stopWatch = new StopWatch();

        stopWatch.start(methodName);

        System.out.println("[LOG] METHOD: [" + methodName + "] is calling.");
        Object rtnObj = pjp.proceed();

        stopWatch.stop();

        System.out.println("[LOG] METHOD: [" + methodName + "] was called.");


        return rtnObj;
    }
}
