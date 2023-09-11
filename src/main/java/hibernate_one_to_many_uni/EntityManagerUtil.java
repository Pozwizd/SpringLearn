package hibernate_one_to_many_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class EntityManagerUtil {

    private static final EntityManagerFactory emf;

    static {
        emf = createEntityManagerFactory("hibernate_one_to_many_uni");
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

}
