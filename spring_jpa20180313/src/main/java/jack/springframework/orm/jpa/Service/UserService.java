package jack.springframework.orm.jpa.Service;

import jack.springframework.orm.jpa.dao.UserDaoTx;
import jack.springframework.orm.jpa.entities.EUser;

public class UserService {

    private UserDaoTx userDao;

    public Long registerUser(String name, String email) {
        EUser user = new EUser(name, email);
        userDao.saveUser(user);
        return user.getId(); // how to set the user's id
    }
}
