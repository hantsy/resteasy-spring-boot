package com.sample.app;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * JAX-RS application
 *
 * Created by facarvalho on 12/7/15.
 */
@Component
@ApplicationPath("/sample-app/")
public class JaxrsApplication extends Application {

    @Override
    public Set<Object> getSingletons() {

        EchoFilter echoFilter = new EchoFilter();
        Set<Object> singletons = new HashSet<>();
        singletons.add(echoFilter);
        return singletons;
    }
}
