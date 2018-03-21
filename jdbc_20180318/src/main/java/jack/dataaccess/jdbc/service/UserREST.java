package jack.dataaccess.jdbc.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/user")
public class UserREST {

    public UserREST() {

    }

    @POST
    @Consumes("text/xml")
    @Produces("text/xml")
    public Long createUser() {

        return null;
    }
}
