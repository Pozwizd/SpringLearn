package aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointsCuts {

    @Pointcut("execution(* adC*(..))")
    public void allAddMethods() {}

    @Pointcut("execution(* aop.UniLibrary.return*())")
    public void allReturnMethodsFromUniLibrary() {}


    @Pointcut("execution(* aop.UniLibrary.*())")
    public void allMethodsFromUniLibrary() {}

    @Pointcut("execution(* aop.UniLibrary.returnMagazine())")
    public void returnMagazineMethodsFromUniLibrary() {}


    @Pointcut("allMethodsFromUniLibrary() && returnMagazineMethodsFromUniLibrary()")
    public void allMethodsExceptReturnMagazineFromUniLibrary() {}


}
