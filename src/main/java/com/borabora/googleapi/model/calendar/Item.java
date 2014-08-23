package com.borabora.googleapi.model.calendar;

/**
 * Borabora Systems
 * Created by mananoreboton on 19/08/14.
 */

import com.borabora.googgleapi.model.calendar.*;
import com.borabora.googgleapi.model.calendar.NotificationSettings;
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
        "id",
        "summary",
        "description",
        "timeZone",
        "colorId",
        "backgroundColor",
        "foregroundColor",
        "selected",
        "accessRole",
        "defaultReminders",
        "notificationSettings",
        "primary"
})
public class Item {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("etag")
    private String etag;
    @JsonProperty("id")
    private String id;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description")
    private String description;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonProperty("colorId")
    private String colorId;
    @JsonProperty("backgroundColor")
    private String backgroundColor;
    @JsonProperty("foregroundColor")
    private String foregroundColor;
    @JsonProperty("selected")
    private Boolean selected;
    @JsonProperty("accessRole")
    private String accessRole;
    @JsonProperty("defaultReminders")
    private List<com.borabora.googgleapi.model.calendar.DefaultReminder> defaultReminders = new ArrayList<com.borabora.googgleapi.model.calendar.DefaultReminder>();
    @JsonProperty("notificationSettings")
    private com.borabora.googgleapi.model.calendar.NotificationSettings notificationSettings;
    @JsonProperty("primary")
    private Boolean primary;
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

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("timeZone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("timeZone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("colorId")
    public String getColorId() {
        return colorId;
    }

    @JsonProperty("colorId")
    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    @JsonProperty("backgroundColor")
    public String getBackgroundColor() {
        return backgroundColor;
    }

    @JsonProperty("backgroundColor")
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @JsonProperty("foregroundColor")
    public String getForegroundColor() {
        return foregroundColor;
    }

    @JsonProperty("foregroundColor")
    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    @JsonProperty("selected")
    public Boolean getSelected() {
        return selected;
    }

    @JsonProperty("selected")
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    @JsonProperty("accessRole")
    public String getAccessRole() {
        return accessRole;
    }

    @JsonProperty("accessRole")
    public void setAccessRole(String accessRole) {
        this.accessRole = accessRole;
    }

    @JsonProperty("defaultReminders")
    public List<com.borabora.googgleapi.model.calendar.DefaultReminder> getDefaultReminders() {
        return defaultReminders;
    }

    @JsonProperty("defaultReminders")
    public void setDefaultReminders(List<com.borabora.googgleapi.model.calendar.DefaultReminder> defaultReminders) {
        this.defaultReminders = defaultReminders;
    }

    @JsonProperty("notificationSettings")
    public com.borabora.googgleapi.model.calendar.NotificationSettings getNotificationSettings() {
        return notificationSettings;
    }

    @JsonProperty("notificationSettings")
    public void setNotificationSettings(NotificationSettings notificationSettings) {
        this.notificationSettings = notificationSettings;
    }

    @JsonProperty("primary")
    public Boolean getPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(Boolean primary) {
        this.primary = primary;
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
