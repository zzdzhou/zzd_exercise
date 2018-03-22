package jack.dataaccess.jdbc.service;

import com.sun.org.glassfish.gmbal.ParameterNames;
import jack.dataaccess.jdbc.datasource.DSConnection;

import javax.jws.WebParam;
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
    public String getUserEmailById(@WebParam(name = "customerNumber") Long id) {
        return new DSConnection().getUserEmailById(id);
    }
}
