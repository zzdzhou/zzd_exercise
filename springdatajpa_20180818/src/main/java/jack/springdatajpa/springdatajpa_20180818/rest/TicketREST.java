package jack.springdatajpa.springdatajpa_20180818.rest;

import jack.springdatajpa.springdatajpa_20180818.dao.TicketRepo;
import jack.springdatajpa.springdatajpa_20180818.entities.Ticket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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
    }

    @GetMapping("/id")
    public Ticket getTicket(@RequestParam int id) {
        Optional<Ticket> ticketOpt = ticketRepo.findById(id);
        return ticketOpt.orElse(null);
    }
}
