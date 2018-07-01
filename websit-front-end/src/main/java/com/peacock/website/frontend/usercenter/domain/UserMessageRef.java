package com.peacock.website.frontend.usercenter.domain;

public class UserMessageRef {
    private String uid;

    private String mid;

    private Integer status;

    public UserMessageRef(String uid, String mid, Integer status) {
        this.uid = uid;
        this.mid = mid;
        this.status = status;
    }

    public UserMessageRef() {
        super();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}