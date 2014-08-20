package com.borabora.googleapi.model.drive;

/**
 * Created by epauser on 20/08/14.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "kind",
        "id",
        "etag",
        "selfLink",
        "alternateLink",
        "embedLink",
        "iconLink",
        "thumbnailLink",
        "title",
        "mimeType",
        "labels",
        "createdDate",
        "modifiedDate",
        "modifiedByMeDate",
        "lastViewedByMeDate",
        "markedViewedByMeDate",
        "version",
        "parents",
        "exportLinks",
        "userPermission",
        "quotaBytesUsed",
        "ownerNames",
        "owners",
        "lastModifyingUserName",
        "lastModifyingUser",
        "editable",
        "copyable",
        "writersCanShare",
        "shared",
        "appDataContents",
        "openWithLinks",
        "defaultOpenWithLink",
        "webContentLink",
        "downloadUrl",
        "originalFilename",
        "fileExtension",
        "fileSize",
        "headRevisionId",
        "explicitlyTrashed"
})
public class Item {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("id")
    private String id;
    @JsonProperty("etag")
    private String etag;
    @JsonProperty("selfLink")
    private String selfLink;
    @JsonProperty("alternateLink")
    private String alternateLink;
    @JsonProperty("embedLink")
    private String embedLink;
    @JsonProperty("iconLink")
    private String iconLink;
    @JsonProperty("thumbnailLink")
    private String thumbnailLink;
    @JsonProperty("title")
    private String title;
    @JsonProperty("mimeType")
    private String mimeType;
    @JsonProperty("labels")
    private Labels labels;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("modifiedDate")
    private String modifiedDate;
    @JsonProperty("modifiedByMeDate")
    private String modifiedByMeDate;
    @JsonProperty("lastViewedByMeDate")
    private String lastViewedByMeDate;
    @JsonProperty("markedViewedByMeDate")
    private String markedViewedByMeDate;
    @JsonProperty("version")
    private String version;
    @JsonProperty("parents")
    private List<Parent> parents = new ArrayList<Parent>();
    @JsonProperty("exportLinks")
    private ExportLinks exportLinks;
    @JsonProperty("userPermission")
    private UserPermission userPermission;
    @JsonProperty("quotaBytesUsed")
    private String quotaBytesUsed;
    @JsonProperty("ownerNames")
    private List<String> ownerNames = new ArrayList<String>();
    @JsonProperty("owners")
    private List<Owner> owners = new ArrayList<Owner>();
    @JsonProperty("lastModifyingUserName")
    private String lastModifyingUserName;
    @JsonProperty("lastModifyingUser")
    private LastModifyingUser lastModifyingUser;
    @JsonProperty("editable")
    private Boolean editable;
    @JsonProperty("copyable")
    private Boolean copyable;
    @JsonProperty("writersCanShare")
    private Boolean writersCanShare;
    @JsonProperty("shared")
    private Boolean shared;
    @JsonProperty("appDataContents")
    private Boolean appDataContents;
    @JsonProperty("openWithLinks")
    private OpenWithLinks openWithLinks;
    @JsonProperty("defaultOpenWithLink")
    private String defaultOpenWithLink;
    @JsonProperty("webContentLink")
    private String webContentLink;
    @JsonProperty("downloadUrl")
    private String downloadUrl;
    @JsonProperty("originalFilename")
    private String originalFilename;
    @JsonProperty("fileExtension")
    private String fileExtension;
    @JsonProperty("fileSize")
    private String fileSize;
    @JsonProperty("headRevisionId")
    private String headRevisionId;
    @JsonProperty("explicitlyTrashed")
    private Boolean explicitlyTrashed;
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

    @JsonProperty("alternateLink")
    public String getAlternateLink() {
        return alternateLink;
    }

    @JsonProperty("alternateLink")
    public void setAlternateLink(String alternateLink) {
        this.alternateLink = alternateLink;
    }

    @JsonProperty("embedLink")
    public String getEmbedLink() {
        return embedLink;
    }

    @JsonProperty("embedLink")
    public void setEmbedLink(String embedLink) {
        this.embedLink = embedLink;
    }

    @JsonProperty("iconLink")
    public String getIconLink() {
        return iconLink;
    }

    @JsonProperty("iconLink")
    public void setIconLink(String iconLink) {
        this.iconLink = iconLink;
    }

    @JsonProperty("thumbnailLink")
    public String getThumbnailLink() {
        return thumbnailLink;
    }

    @JsonProperty("thumbnailLink")
    public void setThumbnailLink(String thumbnailLink) {
        this.thumbnailLink = thumbnailLink;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    @JsonProperty("mimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    @JsonProperty("labels")
    public Labels getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("modifiedDate")
    public String getModifiedDate() {
        return modifiedDate;
    }

    @JsonProperty("modifiedDate")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @JsonProperty("modifiedByMeDate")
    public String getModifiedByMeDate() {
        return modifiedByMeDate;
    }

    @JsonProperty("modifiedByMeDate")
    public void setModifiedByMeDate(String modifiedByMeDate) {
        this.modifiedByMeDate = modifiedByMeDate;
    }

    @JsonProperty("lastViewedByMeDate")
    public String getLastViewedByMeDate() {
        return lastViewedByMeDate;
    }

    @JsonProperty("lastViewedByMeDate")
    public void setLastViewedByMeDate(String lastViewedByMeDate) {
        this.lastViewedByMeDate = lastViewedByMeDate;
    }

    @JsonProperty("markedViewedByMeDate")
    public String getMarkedViewedByMeDate() {
        return markedViewedByMeDate;
    }

    @JsonProperty("markedViewedByMeDate")
    public void setMarkedViewedByMeDate(String markedViewedByMeDate) {
        this.markedViewedByMeDate = markedViewedByMeDate;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("parents")
    public List<Parent> getParents() {
        return parents;
    }

    @JsonProperty("parents")
    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    @JsonProperty("exportLinks")
    public ExportLinks getExportLinks() {
        return exportLinks;
    }

    @JsonProperty("exportLinks")
    public void setExportLinks(ExportLinks exportLinks) {
        this.exportLinks = exportLinks;
    }

    @JsonProperty("userPermission")
    public UserPermission getUserPermission() {
        return userPermission;
    }

    @JsonProperty("userPermission")
    public void setUserPermission(UserPermission userPermission) {
        this.userPermission = userPermission;
    }

    @JsonProperty("quotaBytesUsed")
    public String getQuotaBytesUsed() {
        return quotaBytesUsed;
    }

    @JsonProperty("quotaBytesUsed")
    public void setQuotaBytesUsed(String quotaBytesUsed) {
        this.quotaBytesUsed = quotaBytesUsed;
    }

    @JsonProperty("ownerNames")
    public List<String> getOwnerNames() {
        return ownerNames;
    }

    @JsonProperty("ownerNames")
    public void setOwnerNames(List<String> ownerNames) {
        this.ownerNames = ownerNames;
    }

    @JsonProperty("owners")
    public List<Owner> getOwners() {
        return owners;
    }

    @JsonProperty("owners")
    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    @JsonProperty("lastModifyingUserName")
    public String getLastModifyingUserName() {
        return lastModifyingUserName;
    }

    @JsonProperty("lastModifyingUserName")
    public void setLastModifyingUserName(String lastModifyingUserName) {
        this.lastModifyingUserName = lastModifyingUserName;
    }

    @JsonProperty("lastModifyingUser")
    public LastModifyingUser getLastModifyingUser() {
        return lastModifyingUser;
    }

    @JsonProperty("lastModifyingUser")
    public void setLastModifyingUser(LastModifyingUser lastModifyingUser) {
        this.lastModifyingUser = lastModifyingUser;
    }

    @JsonProperty("editable")
    public Boolean getEditable() {
        return editable;
    }

    @JsonProperty("editable")
    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    @JsonProperty("copyable")
    public Boolean getCopyable() {
        return copyable;
    }

    @JsonProperty("copyable")
    public void setCopyable(Boolean copyable) {
        this.copyable = copyable;
    }

    @JsonProperty("writersCanShare")
    public Boolean getWritersCanShare() {
        return writersCanShare;
    }

    @JsonProperty("writersCanShare")
    public void setWritersCanShare(Boolean writersCanShare) {
        this.writersCanShare = writersCanShare;
    }

    @JsonProperty("shared")
    public Boolean getShared() {
        return shared;
    }

    @JsonProperty("shared")
    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    @JsonProperty("appDataContents")
    public Boolean getAppDataContents() {
        return appDataContents;
    }

    @JsonProperty("appDataContents")
    public void setAppDataContents(Boolean appDataContents) {
        this.appDataContents = appDataContents;
    }

    @JsonProperty("openWithLinks")
    public OpenWithLinks getOpenWithLinks() {
        return openWithLinks;
    }

    @JsonProperty("openWithLinks")
    public void setOpenWithLinks(OpenWithLinks openWithLinks) {
        this.openWithLinks = openWithLinks;
    }

    @JsonProperty("defaultOpenWithLink")
    public String getDefaultOpenWithLink() {
        return defaultOpenWithLink;
    }

    @JsonProperty("defaultOpenWithLink")
    public void setDefaultOpenWithLink(String defaultOpenWithLink) {
        this.defaultOpenWithLink = defaultOpenWithLink;
    }

    @JsonProperty("webContentLink")
    public String getWebContentLink() {
        return webContentLink;
    }

    @JsonProperty("webContentLink")
    public void setWebContentLink(String webContentLink) {
        this.webContentLink = webContentLink;
    }

    @JsonProperty("downloadUrl")
    public String getDownloadUrl() {
        return downloadUrl;
    }

    @JsonProperty("downloadUrl")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @JsonProperty("originalFilename")
    public String getOriginalFilename() {
        return originalFilename;
    }

    @JsonProperty("originalFilename")
    public void setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
    }

    @JsonProperty("fileExtension")
    public String getFileExtension() {
        return fileExtension;
    }

    @JsonProperty("fileExtension")
    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    @JsonProperty("fileSize")
    public String getFileSize() {
        return fileSize;
    }

    @JsonProperty("fileSize")
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    @JsonProperty("headRevisionId")
    public String getHeadRevisionId() {
        return headRevisionId;
    }

    @JsonProperty("headRevisionId")
    public void setHeadRevisionId(String headRevisionId) {
        this.headRevisionId = headRevisionId;
    }

    @JsonProperty("explicitlyTrashed")
    public Boolean getExplicitlyTrashed() {
        return explicitlyTrashed;
    }

    @JsonProperty("explicitlyTrashed")
    public void setExplicitlyTrashed(Boolean explicitlyTrashed) {
        this.explicitlyTrashed = explicitlyTrashed;
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