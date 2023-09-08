package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
public class Person {


    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

//    public Person() {
//        System.out.println("Person bean is created");
//    }

    // pet -> setPet
//    @Autowired
//    @Qualifier("cat")
    public void setPet( Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set Surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set Age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely Pet");
        pet.say();
    }
}
