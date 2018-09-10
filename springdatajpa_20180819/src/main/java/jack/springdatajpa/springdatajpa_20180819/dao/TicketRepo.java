package jack.springdatajpa.springdatajpa_20180819.dao;

import jack.springdatajpa.springdatajpa_20180819.dao.custom.TicketRepoCustom;
import jack.springdatajpa.springdatajpa_20180819.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepo extends CrudRepository<Ticket, Integer>, TicketRepoCustom {
}
