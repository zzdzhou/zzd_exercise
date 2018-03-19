package jack.springframework.orm.jpa.service;

import jack.springframework.orm.jpa.dao.UserDao;
import jack.springframework.orm.jpa.entities.EUser;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    private UserDao userdao;

    @Autowired
    public void setUserdao(UserDao userdao2) {
        this.userdao = userdao2;
    }

    public Long createUser(String name, String email) {
        EUser user = new EUser(name, email);
        userdao.saveUser(user);
        return user.getId(); // how and when to generate user.id
    }
}
