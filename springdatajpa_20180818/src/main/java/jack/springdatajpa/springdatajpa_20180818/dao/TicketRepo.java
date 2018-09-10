package jack.springdatajpa.springdatajpa_20180818.dao;

import jack.springdatajpa.springdatajpa_20180818.dao.custom.TicketRepoCustom;
import jack.springdatajpa.springdatajpa_20180818.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepo extends CrudRepository<Ticket, Integer>, TicketRepoCustom {

}
