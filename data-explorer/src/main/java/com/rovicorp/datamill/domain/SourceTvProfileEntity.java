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
@Table(name = "source_tv_profile")
public class SourceTvProfileEntity {
    @Id
    @Column(name = "source_id")
    private int sourceId;
    @Column(name = "profile_dvs")
    private Long profileDvs;
    @Column(name = "station_owner")
    private String stationOwner;
    @Column(name = "default_duration")
    private String defaultDuration;
    @Column(name="creation_user")
    private String creationUser;
    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name="last_update_user")
    private String lastUpdateUser;

    @Column(name = "last_update_date")
    private Date lastUpdatedDate;
    public SourceTvProfileEntity() {
    }

    public SourceTvProfileEntity(int sourceId, Long profileDvs, String stationOwner, String defaultDuration, String creationUser, Date creationDate, String lastUpdateUser, Date lastUpdatedDate) {
        this.sourceId = sourceId;
        this.profileDvs = profileDvs;
        this.stationOwner = stationOwner;
        this.defaultDuration = defaultDuration;
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

    public Long getProfileDvs() {
        return profileDvs;
    }

    public void setProfileDvs(Long profileDvs) {
        this.profileDvs = profileDvs;
    }

    public String getStationOwner() {
        return stationOwner;
    }

    public void setStationOwner(String stationOwner) {
        this.stationOwner = stationOwner;
    }

    public String getDefaultDuration() {
        return defaultDuration;
    }

    public void setDefaultDuration(String defaultDuration) {
        this.defaultDuration = defaultDuration;
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
        return "SourceTvProfileEntity{" +
                "sourceId=" + sourceId +
                ", profileDvs=" + profileDvs +
                ", stationOwner='" + stationOwner + '\'' +
                ", defaultDuration='" + defaultDuration + '\'' +
                ", creationUser='" + creationUser + '\'' +
                ", creationDate=" + creationDate +
                ", lastUpdateUser='" + lastUpdateUser + '\'' +
                ", lastUpdatedDate=" + lastUpdatedDate +
                '}';
    }
}
