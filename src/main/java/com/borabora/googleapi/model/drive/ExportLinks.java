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
        "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
        "application/vnd.oasis.opendocument.text",
        "application/rtf",
        "text/html",
        "text/plain",
        "application/pdf"
})
public class ExportLinks {

    @JsonProperty("application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    private String applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument;
    @JsonProperty("application/vnd.oasis.opendocument.text")
    private String applicationVndOasisOpendocumentText;
    @JsonProperty("application/rtf")
    private String applicationRtf;
    @JsonProperty("text/html")
    private String textHtml;
    @JsonProperty("text/plain")
    private String textPlain;
    @JsonProperty("application/pdf")
    private String applicationPdf;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    public String getApplicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument() {
        return applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument;
    }

    @JsonProperty("application/vnd.openxmlformats-officedocument.wordprocessingml.document")
    public void setApplicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument(String applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument) {
        this.applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument = applicationVndOpenxmlformatsOfficedocumentWordprocessingmlDocument;
    }

    @JsonProperty("application/vnd.oasis.opendocument.text")
    public String getApplicationVndOasisOpendocumentText() {
        return applicationVndOasisOpendocumentText;
    }

    @JsonProperty("application/vnd.oasis.opendocument.text")
    public void setApplicationVndOasisOpendocumentText(String applicationVndOasisOpendocumentText) {
        this.applicationVndOasisOpendocumentText = applicationVndOasisOpendocumentText;
    }

    @JsonProperty("application/rtf")
    public String getApplicationRtf() {
        return applicationRtf;
    }

    @JsonProperty("application/rtf")
    public void setApplicationRtf(String applicationRtf) {
        this.applicationRtf = applicationRtf;
    }

    @JsonProperty("text/html")
    public String getTextHtml() {
        return textHtml;
    }

    @JsonProperty("text/html")
    public void setTextHtml(String textHtml) {
        this.textHtml = textHtml;
    }

    @JsonProperty("text/plain")
    public String getTextPlain() {
        return textPlain;
    }

    @JsonProperty("text/plain")
    public void setTextPlain(String textPlain) {
        this.textPlain = textPlain;
    }

    @JsonProperty("application/pdf")
    public String getApplicationPdf() {
        return applicationPdf;
    }

    @JsonProperty("application/pdf")
    public void setApplicationPdf(String applicationPdf) {
        this.applicationPdf = applicationPdf;
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