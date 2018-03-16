package jack.springframework.orm.jpa.dao;

import jack.springframework.orm.jpa.entities.EUser;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import java.util.List;

public class UserDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    @PersistenceUnit
    public void setEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    private EntityManager getEntityManager() {
        if (this.em == null) {
            return this.emf.createEntityManager();
        }
        return this.em;
    }

    public List<EUser> findUserByEmail(String email) {
        List<EUser> userList = getEntityManager().createQuery("SELECT u FROM EUser u WHERE u.email = :email")
                .setParameter("email", email)
                .getResultList();  // JPQL is type-unsafe
        return userList;
    }

    // What is finalize() method
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (this.em != null) {
            this.em.close();
        }
    }
}
