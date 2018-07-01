package com.peacock.website.frontend.usercenter.domain;

import java.util.Date;

public class UserMessage {
    private String mid;

    private String title;

    private Integer type;

    private Date submitTime;

    private String content;

    public UserMessage(String mid, String title, Integer type, Date submitTime, String content) {
        this.mid = mid;
        this.title = title;
        this.type = type;
        this.submitTime = submitTime;
        this.content = content;
    }

    public UserMessage() {
        super();
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}