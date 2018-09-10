package jack.springdatajpa.springdatajpa_20180819.rest;

import jack.springdatajpa.springdatajpa_20180819.dao.TicketRepo;
import jack.springdatajpa.springdatajpa_20180819.entities.Ticket;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketREST {

    private TicketRepo ticketRepo;

    public TicketREST(TicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    @GetMapping
    public List<Ticket> getTickets(@RequestParam(required = false) String resource, @RequestParam(required = false) String dateRange) {
        return ticketRepo.getTickets(resource, dateRange);
//        return null;
    }
}
