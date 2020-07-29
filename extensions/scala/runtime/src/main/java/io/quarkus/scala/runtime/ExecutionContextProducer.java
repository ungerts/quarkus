package io.quarkus.scala.runtime;

import io.quarkus.arc.DefaultBean;
import org.eclipse.microprofile.context.ManagedExecutor;
import scala.concurrent.ExecutionContext;
import scala.concurrent.ExecutionContext$;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

@ApplicationScoped
public class ExecutionContextProducer {

    @Singleton
    @DefaultBean
    @Produces
    public ExecutionContext executionContext(ManagedExecutor managedExecutor) {
        return ExecutionContext$.MODULE$.fromExecutor(managedExecutor);
    }

}
