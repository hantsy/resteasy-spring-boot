package com.sample.app;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * JAX-RS application
 *
 * @author Fabio Carvalho (facarvalho@paypal.com or fabiocarvalho777@gmail.com)
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
