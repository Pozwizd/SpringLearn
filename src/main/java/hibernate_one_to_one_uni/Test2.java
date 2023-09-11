package hibernate_one_to_one_uni;

import hibernate_one_to_one_uni.entity.Employee1to1Uni;

import javax.persistence.EntityManager;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        EntityManager em = null;
        // Получение списка работников
        try {
            em = EntityManagerUtil.getEntityManager();
            em.getTransaction().begin();
            List<Employee1to1Uni> employee1to1Unis = em.createQuery("from Employee1to1 where name = 'Alex'", Employee1to1Uni.class).getResultList();
            for (Employee1to1Uni employee1to1Uni : employee1to1Unis) {
                System.out.println(employee1to1Uni);
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
