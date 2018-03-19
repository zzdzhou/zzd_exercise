package jack.springframework.orm.jpa.dao;

import jack.springframework.orm.jpa.entities.EUser;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserDao2 {

    // requesting a transactional EntityManager, also called shared EntityManager
    // The injected EntityManager is Spring-managed
    @PersistenceContext
    private EntityManager em;

    public List<EUser> findUserByEmail(String email) {
        return em.createQuery("select u from EUser u where u.email = :email")
                .setParameter("email", email)
                .getResultList();
    }

    public void saveUser(EUser user) {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }
}
