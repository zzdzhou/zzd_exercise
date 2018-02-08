package jack.springjpa.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity

public class ECustomer {

    private long id;

    private String firstname;

    private String lastname;

    public ECustomer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstname, lastname);
    }
}
