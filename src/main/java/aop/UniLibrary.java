package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void addBook(String personName, Book book) {
        System.out.println("Мы добавляем книжку в UniLibrary");
        System.out.println("____________________________________________");

    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("____________________________________________");

    }

    public void getBook() {
        System.out.println("Мы берем книжку из UniLibrary");
        System.out.println("____________________________________________");

    }

    public String returnBook() {
        System.out.println("Мы возвращаем книжку в UniLibrary");
        return "Война и Мир";


    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
        System.out.println("____________________________________________");

    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в UniLibrary");
        System.out.println("____________________________________________");

    }
}
