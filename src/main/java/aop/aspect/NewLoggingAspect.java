package aop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку пытаются вернуть книжку");
        long begin = System.currentTimeMillis();

        Object targetMethodResult = proceedingJoinPoint.proceed();

        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку успешно вернули книжку");
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку вернули книжку за " + (end - begin) + " миллисекунд");

//        long begin = System.currentTimeMillis();
//
//        Object targetMethodResult = proceedingJoinPoint.proceed();
//
//        long end = System.currentTimeMillis();
//
//        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку вернули книжку за " + (end - begin) + " миллисекономиллисеков");
//
        return targetMethodResult;
    }

}
