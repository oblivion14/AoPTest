package sample.ch1_4;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

/**
 * Created by Melvin on 2015. 12. 2..
 */
public class LoggingAdvice implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        String methodName = invocation.getMethod().getName();
        StopWatch stopWatch = new StopWatch();

        stopWatch.start(methodName);

        System.out.println("[LOG] METHOD:" +methodName + "is calling.");

        Object rtnObj = invocation.proceed();

        stopWatch.stop();

        System.out.println("[LOG] METHOD:" + methodName + "Was called.");

        System.out.println("[LOG] 처리시간:" + stopWatch.getTotalTimeMillis() / 1000 + "초");

        return rtnObj;
    }
}
