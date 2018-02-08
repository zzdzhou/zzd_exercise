package org.jack.springmvc.dao;

import org.jack.springmvc.entities.ECustomer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<ECustomer, Long> {
    ECustomer findECustomerByLastName(String lastname);
}
