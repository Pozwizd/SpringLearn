package hibernate_many_to_many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import static javax.persistence.Persistence.createEntityManagerFactory;

public class EntityManagerUtil {

    private static final EntityManagerFactory emf;

    static {
        emf = createEntityManagerFactory("hibernate_many_to_many");
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

}
