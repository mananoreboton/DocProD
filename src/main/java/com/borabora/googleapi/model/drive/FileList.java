package com.borabora.googleapi.model.drive;

/**
 * Created by epauser on 20/08/14.
 */

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "kind",
        "etag",
        "selfLink",
        "nextPageToken",
        "nextLink",
        "items"
})
public class FileList {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("etag")
    private String etag;
    @JsonProperty("selfLink")
    private String selfLink;
    @JsonProperty("nextPageToken")
    private String nextPageToken;
    @JsonProperty("nextLink")
    private String nextLink;
    @JsonProperty("items")
    private List<Item> items = new ArrayList<Item>();
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

    @JsonProperty("etag")
    public String getEtag() {
        return etag;
    }

    @JsonProperty("etag")
    public void setEtag(String etag) {
        this.etag = etag;
    }

    @JsonProperty("selfLink")
    public String getSelfLink() {
        return selfLink;
    }

    @JsonProperty("selfLink")
    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    @JsonProperty("nextPageToken")
    public String getNextPageToken() {
        return nextPageToken;
    }

    @JsonProperty("nextPageToken")
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    @JsonProperty("nextLink")
    public String getNextLink() {
        return nextLink;
    }

    @JsonProperty("nextLink")
    public void setNextLink(String nextLink) {
        this.nextLink = nextLink;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
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