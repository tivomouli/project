package com.rovicorp.datamill.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.sql.Date;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Table(name = "source_provider_xref")
public class SourceProviderXrefEntity {
    @Id
    @Column(name = "source_id")
    private int sourceId;
    @Column(name = "provider_id")
    private Long providerId;
    @Column(name="creation_user")
    private String creationUser;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name="last_update_user")
    private String lastUpdateUser;
    @Column(name = "last_update_date")
    private Date lastUpdatedDate;
    public SourceProviderXrefEntity() {
    }

    public SourceProviderXrefEntity(int sourceId, Long providerId, String creationUser, Date creationDate, String lastUpdateUser, Date lastUpdatedDate) {
        this.sourceId = sourceId;
        this.providerId = providerId;
        this.creationUser = creationUser;
        this.creationDate = creationDate;
        this.lastUpdateUser = lastUpdateUser;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public Long getProviderId() {
        return providerId;
    }

    public void setProviderId(Long providerId) {
        this.providerId = providerId;
    }

    public String getCreationUser() {
        return creationUser;
    }

    public void setCreationUser(String creationUser) {
        this.creationUser = creationUser;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
    @Override
    public String toString() {
        return "SourceProviderXrefEntity{" +
                "sourceId=" + sourceId +
                ", providerId=" + providerId +
                ", creationUser='" + creationUser + '\'' +
                ", creationDate=" + creationDate +
                ", lastUpdateUser='" + lastUpdateUser + '\'' +
                ", lastUpdatedDate=" + lastUpdatedDate +
                '}';
    }
}
