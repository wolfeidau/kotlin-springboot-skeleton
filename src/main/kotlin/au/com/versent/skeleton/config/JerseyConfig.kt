package au.com.versent.skeleton.config

import au.com.versent.skeleton.resource.UserResource
import org.glassfish.jersey.server.ResourceConfig
import org.springframework.stereotype.Component


@Component class JerseyConfig : ResourceConfig() {

    init {
        register(UserResource::class.java)
    }

}