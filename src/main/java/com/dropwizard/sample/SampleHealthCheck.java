package com.dropwizard.sample;

import com.codahale.metrics.health.HealthCheck;

public class SampleHealthCheck extends HealthCheck {

    private final String version;

    public SampleHealthCheck(String version) {
        this.version = version;
    }

    @Override
    protected Result check() throws Exception {
        final String saying = String.format(version, "invalid");
        if (!saying.contains("invalid")) {
            return Result.unhealthy("template doesn't include a version");
        }
        return Result.healthy();
    }
}
