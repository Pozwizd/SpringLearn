package hibernate_test;

import hibernate_test.entity.Employee;

import javax.persistence.EntityManager;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        EntityManager em = null;
        // Получение списка работников
        try {
            em = EntityManagerUtil.getEntityManager();
            em.getTransaction().begin();
            List<Employee> employees = em.createQuery("from Employee where name= 'Alex'", Employee.class).getResultList();
            for (Employee employee : employees) {
                System.out.println(employee);
            }
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
