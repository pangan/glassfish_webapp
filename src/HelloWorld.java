import javax.ws.rs.*;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage(@DefaultValue("goodbye") @QueryParam("amir") String amir) {
        // Return some cliched textual content
        return "Hello World = "+amir;
    }
}