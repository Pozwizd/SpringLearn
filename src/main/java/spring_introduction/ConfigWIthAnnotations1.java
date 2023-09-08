package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWIthAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Cat myCat = context.getBean("cat", Cat.class);
//        myCat.say();
        Person person = context.getBean("person", Person.class);
        person.callYourPet();
//        System.out.println(person.getSurname());
//        System.out.println(person.getAge());
        context.close();
    }
}
