package com.rovicorp.datamill.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Table(name = "ingest_source_defaults")
public class IngestSourceDefaultsEntity {
    @Id
    @Column(name = "source_id")
    private int sourceId;
    @Column(name = "ingest_source_default_id")
    private Long ingestSourceDefaultId;
    @Column(name="creation_user")
    private String creationUser;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name="last_update_user")
    private String lastUpdateUser;
    @Column(name = "last_update_date")
    private Date lastUpdatedDate;
    @Column(name="overwrite_data")
    private Long overwriteData;
    @Column(name="ingest_language_id")
    private Long ingestLanguageId;

    public IngestSourceDefaultsEntity() {
    }

    public IngestSourceDefaultsEntity(int sourceId, Long ingestSourceDefaultId, String creationUser, Date creationDate, String lastUpdateUser, Date lastUpdatedDate, Long overwriteData, Long ingestLanguageId) {
        this.sourceId = sourceId;
        this.ingestSourceDefaultId = ingestSourceDefaultId;
        this.creationUser = creationUser;
        this.creationDate = creationDate;
        this.lastUpdateUser = lastUpdateUser;
        this.lastUpdatedDate = lastUpdatedDate;
        this.overwriteData = overwriteData;
        this.ingestLanguageId = ingestLanguageId;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public Long getIngestSourceDefaultId() {
        return ingestSourceDefaultId;
    }

    public void setIngestSourceDefaultId(Long ingestSourceDefaultId) {
        this.ingestSourceDefaultId = ingestSourceDefaultId;
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

    public Long getOverwriteData() {
        return overwriteData;
    }

    public void setOverwriteData(Long overwriteData) {
        this.overwriteData = overwriteData;
    }

    public Long getIngestLanguageId() {
        return ingestLanguageId;
    }

    public void setIngestLanguageId(Long ingestLanguageId) {
        this.ingestLanguageId = ingestLanguageId;
    }

    @Override
    public String toString() {
        return "IngestSourceDefaultsEntity{" +
                "sourceId=" + sourceId +
                ", ingestSourceDefaultId=" + ingestSourceDefaultId +
                ", creationUser='" + creationUser + '\'' +
                ", creationDate=" + creationDate +
                ", lastUpdateUser='" + lastUpdateUser + '\'' +
                ", lastUpdatedDate=" + lastUpdatedDate +
                ", overwriteData=" + overwriteData +
                ", ingestLanguageId=" + ingestLanguageId +
                '}';
    }
}
