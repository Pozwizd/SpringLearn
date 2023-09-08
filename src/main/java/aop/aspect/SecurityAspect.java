package aop.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect  {

    @Before("aop.aspect.MyPointsCuts.allAddMethods()") // PointCut
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: проверка права для получения книжкой/журнала" );
    }

}
