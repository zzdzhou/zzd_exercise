package jack.ws.jaxrs.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/helloworld")
public class HelloWorld {

    @GET
    @Path("/html")
    @Produces("text/html")
    public String getHelloWorld() {
        return "<HTML>\n" +
                "<head>\n" +
                "\t<title>Hello World!</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<h1>jax-rs, hello world!</h1>\n" +
                "</body>\n" +
                "</HTML>";
    }
}
