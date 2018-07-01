package com.peacock.website.frontend.usercenter.domain;

public class User {
    private String id;

    private String nickName;

    private String avatar;

    private String gender;

    private String age;

    public User(String id, String nickName, String avatar, String gender, String age) {
        this.id = id;
        this.nickName = nickName;
        this.avatar = avatar;
        this.gender = gender;
        this.age = age;
    }

    public User() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }
}