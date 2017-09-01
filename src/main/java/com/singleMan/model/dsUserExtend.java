package com.singleMan.model;

import java.util.Date;

public class dsUserExtend {
    private Integer id;

    private Integer uid;

    private String email;

    private String location;

    private Boolean vipLevel;

    private Date vipStartTime;

    private Date vipEndTime;

    private Integer viewers;

    private String anonyNickname;

    private Float anonyAmbiguity;

    private Boolean errorLoginTimes;

    private Date lastLoginTime;

    private Integer tipOffTimes;

    private Integer shareTimes;

    private Boolean vipSearchForbidden;

    private Boolean vipAtForbidden;

    private Boolean vipShareForbidden;

    private Boolean vipDynamicHomepage;

    private Boolean genderVisible;

    private Boolean online;

    private Boolean vipOnlineVisible;

    private Date lockExpiredTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Boolean getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(Boolean vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Date getVipStartTime() {
        return vipStartTime;
    }

    public void setVipStartTime(Date vipStartTime) {
        this.vipStartTime = vipStartTime;
    }

    public Date getVipEndTime() {
        return vipEndTime;
    }

    public void setVipEndTime(Date vipEndTime) {
        this.vipEndTime = vipEndTime;
    }

    public Integer getViewers() {
        return viewers;
    }

    public void setViewers(Integer viewers) {
        this.viewers = viewers;
    }

    public String getAnonyNickname() {
        return anonyNickname;
    }

    public void setAnonyNickname(String anonyNickname) {
        this.anonyNickname = anonyNickname == null ? null : anonyNickname.trim();
    }

    public Float getAnonyAmbiguity() {
        return anonyAmbiguity;
    }

    public void setAnonyAmbiguity(Float anonyAmbiguity) {
        this.anonyAmbiguity = anonyAmbiguity;
    }

    public Boolean getErrorLoginTimes() {
        return errorLoginTimes;
    }

    public void setErrorLoginTimes(Boolean errorLoginTimes) {
        this.errorLoginTimes = errorLoginTimes;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getTipOffTimes() {
        return tipOffTimes;
    }

    public void setTipOffTimes(Integer tipOffTimes) {
        this.tipOffTimes = tipOffTimes;
    }

    public Integer getShareTimes() {
        return shareTimes;
    }

    public void setShareTimes(Integer shareTimes) {
        this.shareTimes = shareTimes;
    }

    public Boolean getVipSearchForbidden() {
        return vipSearchForbidden;
    }

    public void setVipSearchForbidden(Boolean vipSearchForbidden) {
        this.vipSearchForbidden = vipSearchForbidden;
    }

    public Boolean getVipAtForbidden() {
        return vipAtForbidden;
    }

    public void setVipAtForbidden(Boolean vipAtForbidden) {
        this.vipAtForbidden = vipAtForbidden;
    }

    public Boolean getVipShareForbidden() {
        return vipShareForbidden;
    }

    public void setVipShareForbidden(Boolean vipShareForbidden) {
        this.vipShareForbidden = vipShareForbidden;
    }

    public Boolean getVipDynamicHomepage() {
        return vipDynamicHomepage;
    }

    public void setVipDynamicHomepage(Boolean vipDynamicHomepage) {
        this.vipDynamicHomepage = vipDynamicHomepage;
    }

    public Boolean getGenderVisible() {
        return genderVisible;
    }

    public void setGenderVisible(Boolean genderVisible) {
        this.genderVisible = genderVisible;
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public Boolean getVipOnlineVisible() {
        return vipOnlineVisible;
    }

    public void setVipOnlineVisible(Boolean vipOnlineVisible) {
        this.vipOnlineVisible = vipOnlineVisible;
    }

    public Date getLockExpiredTime() {
        return lockExpiredTime;
    }

    public void setLockExpiredTime(Date lockExpiredTime) {
        this.lockExpiredTime = lockExpiredTime;
    }
}