package jack.springjpa.dao;

import jack.springjpa.entities.ECustomer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<ECustomer, Long> {
    List<ECustomer> findEcustomerByLastname(String lastname);
}
