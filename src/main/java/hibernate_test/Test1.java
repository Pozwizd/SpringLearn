package hibernate_test;

import hibernate_test.entity.Detail;
import hibernate_test.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class Test1 {

    public static void main(String[] args) {
        EntityManager em = null;

//        Добавление пользователя
//        try{
//            em = EntityManagerUtil.getEntityManager();
//            em.getTransaction().begin();
//            Employee emp = new Employee("Alex", "Ivanov", "IT", 700);
//            Employee emp2 = new Employee("Sergey", "Sidorov", "HR", 600);
//            Employee emp3 = new Employee("Ivan", "Ivanov", "IT", 700);
//            em.persist(emp);
//            em.persist(emp2);
//            em.persist(emp3);
//            Detail detail = new Detail("Kiev", "7777777", "XXXXXXXXXXXX");
//            Detail detail2 = new Detail("Kharkiv", "7777777", "XXXXXXXXXXXX");
//            Detail detail3 = new Detail("Lviv", "7777777", "XXXXXXXXXXXX");
//            emp.setEmpDetail(detail);
//            emp2.setEmpDetail(detail2);
//            emp3.setEmpDetail(detail3);
//            em.getTransaction().commit();
//            System.out.println("Done!");
//            em.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (em != null) {
//                em.getTransaction().rollback();
//            }
//        } finally {
//            if (em != null) {
//                em.close();
//            }
//        }

//        Получение пользователя
//        try {
//            em = EntityManagerUtil.getEntityManager();
//            em.getTransaction().begin();
//            System.out.println(em.find(Employee.class, 1L));
//            em.getTransaction().commit();
//            System.out.println("Done!");
//            em.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (em != null) {
//                em.getTransaction().rollback();
//            }
//        } finally {
//            if (em != null) {
//                em.close();
//            }
//        }

//        Изменение пользователя
//        try {
//            em = EntityManagerUtil.getEntityManager();
//            em.getTransaction().begin();
//            Employee emp = em.find(Employee.class, 1L);
//            emp.setSalary(1500);
//            em.getTransaction().commit();
//            System.out.println("Done!");
//            em.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (em != null) {
//                em.getTransaction().rollback();
//            }
//        } finally {
//            if (em != null) {
//                em.close();
//            }
//        }

//        Удаление пользователя
        try {
            em = EntityManagerUtil.getEntityManager();
            em.getTransaction().begin();
            Employee emp = em.find(Employee.class, 1L);
            em.remove(emp);
            em.getTransaction().commit();
            System.out.println("Done!");
            em.close();
        } catch (Exception e) {
            e.printStackTrace();
            if (em != null) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
}
