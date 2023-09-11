package hibernate_many_to_many;



import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;

import javax.persistence.EntityManager;

public class Test1 {

    public static void main(String[] args) {
        EntityManager em = null;

//        Добавление пользователя
//        try {
//            em = EntityManagerUtil.getEntityManager();
//            em.getTransaction().begin();
//
//            Section section1 = new Section("Football");
//            Section section2 = new Section("Volleyball");
//            Section section3 = new Section("Chess");
//            Child child1 = new Child("Vasya", 11);
//            Child child2 = new Child("Petya", 10);
//            Child child3 = new Child("Masha", 12);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section2.addChildToSection(child3);
//
//
//            em.persist(section1);
//            em.persist(section2);
//            em.persist(section3);
//
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
            Section section = em.find(Section.class, 4);
            em.remove(section);
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
