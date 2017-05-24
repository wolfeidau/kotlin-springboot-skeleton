package au.com.versent.skeleton.resource

import au.com.versent.skeleton.model.User
import org.springframework.stereotype.Component
import javax.ws.rs.GET
import javax.ws.rs.Path

import javax.ws.rs.core.Response

@Component
@Path("/users")
class UserResource {

    @GET
    fun findAll(): Response {
        return Response.ok(User("Mark", "Wolfe", "wolfeidau")).build()
    }

    @GET
    @Path("/health")
    fun health(): Response {
        return Response.ok({}).build()
    }

}
