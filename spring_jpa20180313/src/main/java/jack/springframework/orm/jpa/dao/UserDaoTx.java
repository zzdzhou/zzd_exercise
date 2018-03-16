package jack.springframework.orm.jpa.dao;

import jack.springframework.orm.jpa.entities.EUser;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserDaoTx {

    /* requesting a transactional EntityManager(also called "shared EntityManager")
     * How to set persistence unit
     */
    @PersistenceContext
    private EntityManager em;

    public List<EUser> findUserByEmail(String email) {
        List<EUser> userList = em.createQuery("select u from EUser u where u.email = :email")
                .setParameter("email", email)
                .getResultList();
        return userList;
    }

    public void saveUser(EUser user) {
        em.persist(user);
    }
}
