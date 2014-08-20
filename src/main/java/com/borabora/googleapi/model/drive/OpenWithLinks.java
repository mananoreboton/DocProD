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
        "1092636219480"
})
public class OpenWithLinks {

    @JsonProperty("1092636219480")
    private String _1092636219480;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("1092636219480")
    public String get1092636219480() {
        return _1092636219480;
    }

    @JsonProperty("1092636219480")
    public void set1092636219480(String _1092636219480) {
        this._1092636219480 = _1092636219480;
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