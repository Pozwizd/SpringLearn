package hibernate_one_to_one;

import hibernate_one_to_one.entity.Employee1to1;
import javax.persistence.EntityManager;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        EntityManager em = null;
        // Получение списка работников
        try {
            em = EntityManagerUtil.getEntityManager();
            em.getTransaction().begin();
            List<Employee1to1> employee1to1s = em.createQuery("from Employee1to1 where name= 'Alex'", Employee1to1.class).getResultList();
            for (Employee1to1 employee1to1 : employee1to1s) {
                System.out.println(employee1to1);
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
