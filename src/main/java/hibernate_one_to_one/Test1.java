package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail1to1;
import hibernate_one_to_one.entity.Employee1to1;

import javax.persistence.EntityManager;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class Test1 {

    public static void main(String[] args) {
        EntityManager em = null;

//        Добавление пользователя
        try {
            em = EntityManagerUtil.getEntityManager();
            em.getTransaction().begin();
            Employee1to1 emp = new Employee1to1("Alex", "Ivanov", "IT", 700);
            Employee1to1 emp2 = new Employee1to1("Sergey", "Sidorov", "HR", 600);
            Employee1to1 emp3 = new Employee1to1("Ivan", "Ivanov", "IT", 700);
//            em.persist(emp);
//            em.persist(emp2);
//            em.persist(emp3);
            Detail1to1 detail1to1 = new Detail1to1("Kiev", "7777777", "XXXXXXXXXXXX");
            Detail1to1 detail1to12 = new Detail1to1("Kharkiv", "7777777", "XXXXXXXXXXXX");
            Detail1to1 detail1to13 = new Detail1to1("Lviv", "7777777", "XXXXXXXXXXXX");
            emp.setEmpDetail(detail1to1);
            emp2.setEmpDetail(detail1to12);
            emp3.setEmpDetail(detail1to13);
            detail1to13.setEmployee(emp);
            detail1to12.setEmployee(emp2);
            detail1to1.setEmployee(emp3);
            em.persist(detail1to1);
            em.persist(detail1to12);
            em.persist(detail1to13);
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
//        try {
//            em = EntityManagerUtil.getEntityManager();
//            em.getTransaction().begin();
//            // Удалить все содержимое таблицы
//            em.createQuery("delete from Employee").executeUpdate();
//            em.createQuery("delete from Detail").executeUpdate();
//            Employee emp = em.find(Employee.class, 1L);
//            em.remove(emp);
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
    }
}
