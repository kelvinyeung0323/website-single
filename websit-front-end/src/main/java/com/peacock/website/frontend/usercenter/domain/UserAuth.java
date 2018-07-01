package com.peacock.website.frontend.usercenter.domain;

import java.util.Date;

public class UserAuth {
    private String id;

    private String userId;

    private Integer identifyType;

    private String identifier;

    private String credential;

    private Integer verified;

    private String lastIp;

    private Date lastTime;

    public UserAuth(String id, String userId, Integer identifyType, String identifier, String credential, Integer verified, String lastIp, Date lastTime) {
        this.id = id;
        this.userId = userId;
        this.identifyType = identifyType;
        this.identifier = identifier;
        this.credential = credential;
        this.verified = verified;
        this.lastIp = lastIp;
        this.lastTime = lastTime;
    }

    public UserAuth() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(Integer identifyType) {
        this.identifyType = identifyType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential == null ? null : credential.trim();
    }

    public Integer getVerified() {
        return verified;
    }

    public void setVerified(Integer verified) {
        this.verified = verified;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}