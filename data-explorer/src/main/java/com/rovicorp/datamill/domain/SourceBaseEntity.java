package com.rovicorp.datamill.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.sql.Date;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Table(name = "source_base")
public class SourceBaseEntity {

    @Id
    @Column(name = "source_id")
    private int sourceId;
    @Column(name = "source_type_id")
    private Long sourceTypeId;
    @Column(name = "status_id")
    private Long statusId;

    @Column(name = "name")
    private String name;

    @Column(name="creation_user")
    private String creationUser;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name="last_update_user")
    private String lastUpdateUser;
    @Column(name = "last_update_date")
    private Date lastUpdatedDate;

    public SourceBaseEntity() {
    }

    public SourceBaseEntity(int sourceId, Long sourceTypeId, Long statusId, String name, String creationUser, Date creationDate, String lastUpdateUser, Date lastUpdatedDate) {
        this.sourceId = sourceId;
        this.sourceTypeId = sourceTypeId;
        this.statusId = statusId;
        this.name = name;
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

    public Long getSourceTypeId() {
        return sourceTypeId;
    }

    public void setSourceTypeId(Long sourceTypeId) {
        this.sourceTypeId = sourceTypeId;
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "SourceBaseEntity{" +
                "sourceId=" + sourceId +
                ", sourceTypeId=" + sourceTypeId +
                ", statusId=" + statusId +
                ", name='" + name + '\'' +
                ", creationUser='" + creationUser + '\'' +
                ", creationDate=" + creationDate +
                ", lastUpdateUser='" + lastUpdateUser + '\'' +
                ", lastUpdatedDate=" + lastUpdatedDate +
                '}';
    }
}