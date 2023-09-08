package aop.aspect;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// Advice:
// @Before - before method
// @After - after method
// @AfterReturning - выполняется только после нормального окончания метода
// @AfterThrowing - после исключения
// @Around - метод до и после

@Component
@Aspect
@Order(1)
public class LoggingAspect {


    /*
    execution(modifiers-pattern? return-type-pattern! declaring-type-pattern?
    method-name-pattern(param-pattern)! throws-pattern?)
     */


//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing log #4");
//    }

//
//    @Before("allGetMethodsFromUniLibrary()") // PointCut
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing log #2");
//    }
//
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
//    }


    @Before("aop.aspect.MyPointsCuts.allAddMethods()") // PointCut
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = "
                + methodSignature);
        System.out.println("methodSignature.getMethod() = "
                + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = "
                + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = "
                + methodSignature.getName());
        System.out.println("beforeGetLoggingAdvice: " +
                "логирование попытки получить книжку/журнал");

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book myBook) {
                    System.out.println("Имя книги = " + myBook.getName());
                    System.out.println("Имя автора = " + myBook.getAuthor());
                    System.out.println("Год издания = " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
            }
        }

    }

//    @Before("execution(* return*())") // PointCut
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книжку");
//    }


}
