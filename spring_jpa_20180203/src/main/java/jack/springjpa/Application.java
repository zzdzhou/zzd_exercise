package jack.springjpa;

import jack.springjpa.dao.CustomerRepo;
import jack.springjpa.entities.ECustomer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }


    public CommandLineRunner demo(CustomerRepo customerRepo) {
        return (args) -> {
            // save a couple of customers
            customerRepo.save(new ECustomer("Jack", "Bauer"));
            customerRepo.save(new ECustomer("Chloe", "O'Brian"));
            customerRepo.save(new ECustomer("Kim", "Bauer"));
            customerRepo.save(new ECustomer("David", "Palmer"));
            customerRepo.save(new ECustomer("Michelle", "Dessler"));

            // fetch all customers
            log.info("Customes found with findAll():");
            log.info("------------------------------");
            for (ECustomer item : customerRepo.findAll()) {
                log.info(item.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            ECustomer customer = customerRepo.findOne(1L);
            log.info("Customer found with findOne(\"1L\")");
            log.info("-----------------------------------");
            log.info(customer.toString());
            log.info("");

            // fetch customer by lastname
            log.info("Customer found with findEcustomerByLastname(\"Bauer\")");
            log.info("------------------------------------------------------");
            for (ECustomer item : customerRepo.findEcustomerByLastname("Bauer")) {
                log.info(item.toString());
            }
            log.info("");

        };
    }


}
