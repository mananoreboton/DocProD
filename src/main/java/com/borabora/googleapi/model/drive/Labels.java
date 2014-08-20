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
        "starred",
        "hidden",
        "trashed",
        "restricted",
        "viewed"
})
public class Labels {

    @JsonProperty("starred")
    private Boolean starred;
    @JsonProperty("hidden")
    private Boolean hidden;
    @JsonProperty("trashed")
    private Boolean trashed;
    @JsonProperty("restricted")
    private Boolean restricted;
    @JsonProperty("viewed")
    private Boolean viewed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("starred")
    public Boolean getStarred() {
        return starred;
    }

    @JsonProperty("starred")
    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    @JsonProperty("hidden")
    public Boolean getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @JsonProperty("trashed")
    public Boolean getTrashed() {
        return trashed;
    }

    @JsonProperty("trashed")
    public void setTrashed(Boolean trashed) {
        this.trashed = trashed;
    }

    @JsonProperty("restricted")
    public Boolean getRestricted() {
        return restricted;
    }

    @JsonProperty("restricted")
    public void setRestricted(Boolean restricted) {
        this.restricted = restricted;
    }

    @JsonProperty("viewed")
    public Boolean getViewed() {
        return viewed;
    }

    @JsonProperty("viewed")
    public void setViewed(Boolean viewed) {
        this.viewed = viewed;
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