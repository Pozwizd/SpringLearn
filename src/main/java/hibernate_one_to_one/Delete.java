package hibernate_one_to_one;

import javax.persistence.EntityManager;

public class Delete {
    public static void main(String[] args) {
        EntityManager em = null;
//        try {
//            em = EntityManagerUtil.getEntityManager();
//            em.getTransaction().begin();
//            em.createQuery("delete from Employee").executeUpdate();
//            em.createQuery("delete from Detail").executeUpdate();
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
        // Удалить все содержимонно таблицы и сбросить автоинкриментировани
        String tableName = "employees";
        String tableName1 = "details";
        String deleteQuery = "SET FOREIGN_KEY_CHECKS = 0;";
        String resetQuery = "TRUNCATE TABLE " + tableName1 + ";";

        try {
            em = EntityManagerUtil.getEntityManager();
            em.getTransaction().begin();
            em.createNativeQuery(deleteQuery).executeUpdate();
            em.createNativeQuery(resetQuery).executeUpdate();
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
