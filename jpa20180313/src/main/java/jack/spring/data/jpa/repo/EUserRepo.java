package jack.spring.data.jpa.repo;

import jack.spring.data.jpa.entity.EUser;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface EUserRepo extends Repository<EUser, Long> {
    List<EUser> findByName(String name);
}
