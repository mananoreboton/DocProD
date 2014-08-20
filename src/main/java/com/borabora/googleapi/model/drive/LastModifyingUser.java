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
        "displayName",
        "isAuthenticatedUser",
        "permissionId",
        "emailAddress"
})
public class LastModifyingUser {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("isAuthenticatedUser")
    private Boolean isAuthenticatedUser;
    @JsonProperty("permissionId")
    private String permissionId;
    @JsonProperty("emailAddress")
    private String emailAddress;
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

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("isAuthenticatedUser")
    public Boolean getIsAuthenticatedUser() {
        return isAuthenticatedUser;
    }

    @JsonProperty("isAuthenticatedUser")
    public void setIsAuthenticatedUser(Boolean isAuthenticatedUser) {
        this.isAuthenticatedUser = isAuthenticatedUser;
    }

    @JsonProperty("permissionId")
    public String getPermissionId() {
        return permissionId;
    }

    @JsonProperty("permissionId")
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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