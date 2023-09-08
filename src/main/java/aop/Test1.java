package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary  uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.getBook();
//        uniLibrary.getMagazine();

        Book book = context.getBean("book", Book.class);
        uniLibrary.addBook("Regus", book);
        uniLibrary.addMagazine();

//        uniLibrary.returnBook();

//        uniLibrary.getBook();
//        uniLibrary.getMagazine();
//        uniLibrary.addBook();
//        uniLibrary.returnMagazine();
//
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
