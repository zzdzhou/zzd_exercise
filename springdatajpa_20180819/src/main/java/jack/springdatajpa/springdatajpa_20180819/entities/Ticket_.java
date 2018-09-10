package jack.springdatajpa.springdatajpa_20180819.entities;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@StaticMetamodel(Ticket.class)
public class Ticket_ {

    public static volatile SingularAttribute<Ticket, LocalDate> date;
    public static volatile SingularAttribute<Ticket, String> activity;
    public static volatile SingularAttribute<Ticket, String> resource;
    public static volatile SingularAttribute<Ticket, String> description;
    public static volatile SingularAttribute<Ticket, Float> days;
    public static volatile SingularAttribute<Ticket, Integer> id;
    public static volatile SingularAttribute<Ticket, String> type;

}
