package com.dropwizard.sample;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SampleResponse {

    private String name;
    private String content;
    private String version;


    public SampleResponse() {
    }

    public SampleResponse(String name, String content, String version) {
        this.name = name;
        this.content = content;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }

    @JsonProperty
    public void setContent(String content) {
        this.content = content;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
