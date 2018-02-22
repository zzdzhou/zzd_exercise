package jack.jpa.manager;

import jack.jpa.entity.Region;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.List;

public class RegionManager {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public void init() {
        entityManagerFactory = Persistence.createEntityManagerFactory("HibernateUnit");
        System.out.println(entityManagerFactory.getClass().getSimpleName());
        entityManager = entityManagerFactory.createEntityManager();
        System.out.println(entityManager.getClass().getSimpleName());
    }

    public List<Region> getRegionList() {
        return entityManager.createQuery("SELECT r FROM Region r").getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

}