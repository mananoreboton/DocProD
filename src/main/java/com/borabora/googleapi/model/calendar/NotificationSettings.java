package com.borabora.googleapi.model.calendar;

/**
 * Borabora Systems
 * Created by mananoreboton on 19/08/14.
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
        "notifications"
})
public class NotificationSettings {

    @JsonProperty("notifications")
    private List<Notification> notifications = new ArrayList<Notification>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("notifications")
    public List<Notification> getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
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
