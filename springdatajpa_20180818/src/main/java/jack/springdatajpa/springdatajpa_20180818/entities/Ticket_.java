package jack.springdatajpa.springdatajpa_20180818.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

//@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ticket.class)
public /*abstract*/ class Ticket_ {

	public static volatile SingularAttribute<Ticket, LocalDate> date;
	public static volatile SingularAttribute<Ticket, String> activity;
	public static volatile SingularAttribute<Ticket, String> resource;
	public static volatile SingularAttribute<Ticket, String> description;
	public static volatile SingularAttribute<Ticket, Float> days;
	public static volatile SingularAttribute<Ticket, Integer> id;
	public static volatile SingularAttribute<Ticket, String> type;

	/*public static final String DATE = "date";
	public static final String ACTIVITY = "activity";
	public static final String RESOURCE = "resource";
	public static final String DESCRIPTION = "description";
	public static final String DAYS = "days";
	public static final String ID = "id";
	public static final String TYPE = "type";*/

}

