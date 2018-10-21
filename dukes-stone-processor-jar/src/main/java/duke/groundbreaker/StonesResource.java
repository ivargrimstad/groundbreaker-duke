package duke.groundbreaker;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("stones")
@RequestScoped
public class StonesResource {

    @Inject
    @ConfigProperty(name = "color", defaultValue = "gray")
    private String color;


    @GET
    @Path("{name}")
    @Produces(APPLICATION_JSON)
    public Response getStone(@PathParam("name") String name) {

        Stone stone = new Stone(name, color);

        return Response.ok(stone).build();
    }
}