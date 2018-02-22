package jack.jpa;

import jack.jpa.entity.City;
import jack.jpa.entity.Region;
import jack.jpa.manager.RegionManager;

import javax.persistence.EntityManager;

public class SimpleExample {

    public static void main(String[] args) {
        RegionManager regionManager = new RegionManager();
        regionManager.init();
        EntityManager em = regionManager.getEntityManager();
        test2(em);
    }

    private static void test2(EntityManager em) {
        em.getTransaction().begin();
        Region region = new Region("New region 3.02.2015");
        em.persist(region);

        City city = new City("New city 03.02.2015");
        city.setRegion(region);
        em.persist(city);
        em.getTransaction().commit();

        Integer id = region.getRegionId();
        System.out.println("region id = " + id);

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // testing cascade
        em.getTransaction().begin();
        region.setRegionId(region.getRegionId() + 1000);
        System.out.println("region's new id = " + region.getRegionId());
        em.merge(region);
        em.getTransaction().commit();

    }
}



