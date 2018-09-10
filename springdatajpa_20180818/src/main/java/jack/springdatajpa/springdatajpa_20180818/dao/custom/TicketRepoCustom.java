package jack.springdatajpa.springdatajpa_20180818.dao.custom;

import jack.springdatajpa.springdatajpa_20180818.entities.Ticket;

import java.util.List;

public interface TicketRepoCustom {

    List<Ticket> getTickets(String resource, String dateRange);
}
