package jack.springdatajpa.springdatajpa_20180819.dao.custom;

import jack.springdatajpa.springdatajpa_20180819.entities.Ticket;

import java.util.List;

public interface TicketRepoCustom {

    List<Ticket> getTickets(String resource, String dateRange);
}
