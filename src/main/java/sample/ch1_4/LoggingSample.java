package sample.ch1_4;

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
public class LoggingSample {


//    @Around("execution(* sayHello())")
  @Around("execution(* sample.ch1_4.usinglog.*.*(..))")

    public Object logAround(ProceedingJoinPoint pjp) throws Throwable{
        String methodName = pjp.getSignature().getName();
        StopWatch stopWatch = new StopWatch();

        stopWatch.start(methodName);



        System.out.println("[LOG] METHOD: [" + methodName + "] is calling.");
        Object rtnObj = pjp.proceed();

        stopWatch.stop();

        System.out.println("[LOG] METHOD: [" + methodName + "] was called.");
        System.out.println("[LOG] 처리시간: " + stopWatch.getTotalTimeMillis() / 1000 + "초");

        return rtnObj;
    }
}
