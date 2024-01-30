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
@Table(name = "ingest_copy_type_xref")
public class IngestCopyTypeXrefEntity {
    @Id
    @Column(name = "source_id")
    private int sourceId;
    @Column(name = "copy_type_xref_id")
    private Long copyTypeXrefId;
    @Column(name = "ingest_copy_type_id")
    private Long ingestCopyTypeId;
    @Column(name="copy_type_id")
    private long copyTypeId;
    @Column(name="creation_user")
    private String creationUser;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name="last_update_user")
    private String lastUpdateUser;
    @Column(name = "last_update_date")
    private Date lastUpdatedDate;
    public IngestCopyTypeXrefEntity() {
    }

    public IngestCopyTypeXrefEntity(int sourceId, Long copyTypeXrefId, Long ingestCopyTypeId, long copyTypeId, String creationUser, Date creationDate, String lastUpdateUser, Date lastUpdatedDate) {
        this.sourceId = sourceId;
        this.copyTypeXrefId = copyTypeXrefId;
        this.ingestCopyTypeId = ingestCopyTypeId;
        this.copyTypeId = copyTypeId;
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

    public Long getCopyTypeXrefId() {
        return copyTypeXrefId;
    }

    public void setCopyTypeXrefId(Long copyTypeXrefId) {
        this.copyTypeXrefId = copyTypeXrefId;
    }

    public Long getIngestCopyTypeId() {
        return ingestCopyTypeId;
    }

    public void setIngestCopyTypeId(Long ingestCopyTypeId) {
        this.ingestCopyTypeId = ingestCopyTypeId;
    }

    public long getCopyTypeId() {
        return copyTypeId;
    }

    public void setCopyTypeId(long copyTypeId) {
        this.copyTypeId = copyTypeId;
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
        return "IngestCopyTypeXrefEntity{" +
                "sourceId=" + sourceId +
                ", copyTypeXrefId=" + copyTypeXrefId +
                ", ingestCopyTypeId=" + ingestCopyTypeId +
                ", copyTypeId=" + copyTypeId +
                ", creationUser='" + creationUser + '\'' +
                ", creationDate=" + creationDate +
                ", lastUpdateUser='" + lastUpdateUser + '\'' +
                ", lastUpdatedDate=" + lastUpdatedDate +
                '}';
    }
}
