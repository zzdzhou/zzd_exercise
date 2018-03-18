package jack.springframework.orm.jpa.dao;

import jack.springframework.orm.jpa.entities.EUser;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

public class UserDao {

    private EntityManagerFactory emf;

    // register EntityManagerFactory, it is Java SE type, Application-managed EntityFactory
    @PersistenceUnit(unitName = "hibernateUnit")
    public void setEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public List<EUser> findUserByEmail(String email) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("select u from EUser u where u.email = :email")
                    .setParameter("email", email)
                    .getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void saveUser(EUser user) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

}
