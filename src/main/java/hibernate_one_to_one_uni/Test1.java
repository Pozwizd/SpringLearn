package hibernate_one_to_one_uni;


import hibernate_one_to_one_uni.entity.Detail1to1Uni;
import hibernate_one_to_one_uni.entity.Employee1to1Uni;

import javax.persistence.EntityManager;

public class Test1 {

    public static void main(String[] args) {
        EntityManager em = null;

//        Добавление пользователя
        try {
            em = EntityManagerUtil.getEntityManager();
            em.getTransaction().begin();
            Employee1to1Uni emp = new Employee1to1Uni("Alex", "Ivanov", "IT", 700);
            Employee1to1Uni emp2 = new Employee1to1Uni("Sergey", "Sidorov", "HR", 600);
            Employee1to1Uni emp3 = new Employee1to1Uni("Ivan", "Ivanov", "IT", 700);
            em.persist(emp);
            em.persist(emp2);
            em.persist(emp3);
            Detail1to1Uni detail1to1Uni = new Detail1to1Uni("Kiev", "+1234567890", "XXXXXXXXXXXX");
            Detail1to1Uni detail1to1Uni2 = new Detail1to1Uni("Kharkiv", "+1234567890", "XXXXXXXXXXXX");
            Detail1to1Uni detail1to1Uni3 = new Detail1to1Uni("Lviv", "+1234567890", "XXXXXXXXXXXX");

            emp.setEmpDetail(detail1to1Uni);
            emp2.setEmpDetail(detail1to1Uni2);
            emp3.setEmpDetail(detail1to1Uni3);
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
