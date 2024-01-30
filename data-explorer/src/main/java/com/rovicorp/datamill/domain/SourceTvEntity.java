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
@Table(name = "source_tv")
public class SourceTvEntity {
    @Id
    @Column(name = "source_id")
    private int sourceId;
    @Column(name = "long_name")
    private String longName;
    @Column(name = "call_letters")
    private String callLetters;
    @Column(name = "city")
    private String city;
    @Column(name="creation_user")
    private String creationUser;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name="last_update_user")
    private String lastUpdateUser;
    @Column(name = "last_update_date")
    private Date lastUpdatedDate;
    public SourceTvEntity() {
    }
    public SourceTvEntity(int sourceId, String longName, String callLetters, String city, String creationUser, Date creationDate, String lastUpdateUser, Date lastUpdatedDate) {
        this.sourceId = sourceId;
        this.longName = longName;
        this.callLetters = callLetters;
        this.city = city;
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

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getCallLetters() {
        return callLetters;
    }

    public void setCallLetters(String callLetters) {
        this.callLetters = callLetters;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        return "SourceTvEntity{" +
                "sourceId=" + sourceId +
                ", longName='" + longName + '\'' +
                ", callLetters='" + callLetters + '\'' +
                ", city='" + city + '\'' +
                ", creationUser='" + creationUser + '\'' +
                ", creationDate=" + creationDate +
                ", lastUpdateUser='" + lastUpdateUser + '\'' +
                ", lastUpdatedDate=" + lastUpdatedDate +
                '}';
    }
}
