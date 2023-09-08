package spring_introduction;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
//        Person person = context.getBean("person", Person.class);
//        person.callYourPet();
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
