package hibernate_one_to_many_uni;



import hibernate_one_to_many_uni.entity.Department1toNUni;
import hibernate_one_to_many_uni.entity.Employee1toNUni;

import javax.persistence.EntityManager;

public class Test1 {

    public static void main(String[] args) {
        EntityManager em = null;

//        Добавление пользователя
        try {
            em = EntityManagerUtil.getEntityManager();
            em.getTransaction().begin();
            Department1toNUni department1toNUni = new Department1toNUni("IT", 1200, 200);
            Employee1toNUni emp = new Employee1toNUni("Oleg", "Ivanov", 700);
            Employee1toNUni emp1 = new Employee1toNUni("Andrey", "Sidorov", 800);
            department1toNUni.addEmployeeToDepartment(emp);
            department1toNUni.addEmployeeToDepartment(emp1);
            em.persist(department1toNUni);
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
//            Department department = em.find(Department.class, 3);
//            em.remove(department);
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
    }
}
