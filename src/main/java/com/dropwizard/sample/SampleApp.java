package com.dropwizard.sample;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SampleApp extends Application<SampleConfig> {

    private static String APP_NAME = "sample-app-name";

    public static void main(String[] args) throws Exception {
        new SampleApp().run(args);
    }

    @Override
    public String getName() {
        return APP_NAME;
    }

    @Override
    public void initialize(Bootstrap<SampleConfig> bootstrap) {
        super.initialize(bootstrap);
    }

    @Override
    public void run(SampleConfig configuration, Environment environment) throws Exception {
        final SampleResource resource = new SampleResource(
                configuration.getVersion());

        final SampleHealthCheck healthCheck =
                new SampleHealthCheck(configuration.getVersion());
        environment.healthChecks().register("healthCheck", healthCheck);
        environment.jersey().register(resource);
    }
}
