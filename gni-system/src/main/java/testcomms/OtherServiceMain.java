package testcomms;

import io.advantageous.qbit.admin.ManagedServiceBuilder;

/**
 * Created by noel on 21-2-17.
 */
public final class OtherServiceMain {

    public static void main(final String[] args) {
                /* Create the ManagedServiceBuilder which manages a clean shutdown, health, stats, etc. */
        final ManagedServiceBuilder managedServiceBuilder =
                ManagedServiceBuilder.managedServiceBuilder()
                        .setRootURI("/services") //Defaults to services
                        .setPort(8888); //Defaults to 8080 or environment variable PORT

        /* Start the service. */
                managedServiceBuilder.addEndpointService(new OtherService()) //Register TodoService
                .getEndpointServerBuilder()
                .build().startServer();

        System.out.println("Other server started");

    }
}
