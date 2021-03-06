package com.borabora.googleapi.model.drive;

/**
 * Created by epauser on 20/08/14.
 */

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "kind",
        "id",
        "selfLink",
        "parentLink",
        "isRoot"
})
public class Parent {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("id")
    private String id;
    @JsonProperty("selfLink")
    private String selfLink;
    @JsonProperty("parentLink")
    private String parentLink;
    @JsonProperty("isRoot")
    private Boolean isRoot;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("selfLink")
    public String getSelfLink() {
        return selfLink;
    }

    @JsonProperty("selfLink")
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    @JsonProperty("parentLink")
    public String getParentLink() {
        return parentLink;
    }

    @JsonProperty("parentLink")
    public void setParentLink(String parentLink) {
        this.parentLink = parentLink;
    }

    @JsonProperty("isRoot")
    public Boolean getIsRoot() {
        return isRoot;
    }

    @JsonProperty("isRoot")
    public void setIsRoot(Boolean isRoot) {
        this.isRoot = isRoot;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}