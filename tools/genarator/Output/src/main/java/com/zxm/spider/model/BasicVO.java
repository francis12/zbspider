package com.zxm.spider.model;

import java.util.Date;

public class BasicVO {
    private Integer basicId;

    private String basicTitle;

    private String basicThumbnails;

    private Long basicHit;

    private Integer basicSort;

    private Date basicDatetime;

    private Date basicUpdatetime;

    private Integer basicPeopleid;

    private Integer basicCategoryid;

    private Integer basicAppid;

    private Integer basicModelid;

    private Integer basicComment;

    private Integer basicCollect;

    private Integer basicShare;

    private String basicType;

    private Integer basicDisplay;

    private String basicDescription;

    public Integer getBasicId() {
        return basicId;
    }

    public void setBasicId(Integer basicId) {
        this.basicId = basicId;
    }

    public String getBasicTitle() {
        return basicTitle;
    }

    public void setBasicTitle(String basicTitle) {
        this.basicTitle = basicTitle == null ? null : basicTitle.trim();
    }

    public String getBasicThumbnails() {
        return basicThumbnails;
    }

    public void setBasicThumbnails(String basicThumbnails) {
        this.basicThumbnails = basicThumbnails == null ? null : basicThumbnails.trim();
    }

    public Long getBasicHit() {
        return basicHit;
    }

    public void setBasicHit(Long basicHit) {
        this.basicHit = basicHit;
    }

    public Integer getBasicSort() {
        return basicSort;
    }

    public void setBasicSort(Integer basicSort) {
        this.basicSort = basicSort;
    }

    public Date getBasicDatetime() {
        return basicDatetime;
    }

    public void setBasicDatetime(Date basicDatetime) {
        this.basicDatetime = basicDatetime;
    }

    public Date getBasicUpdatetime() {
        return basicUpdatetime;
    }

    public void setBasicUpdatetime(Date basicUpdatetime) {
        this.basicUpdatetime = basicUpdatetime;
    }

    public Integer getBasicPeopleid() {
        return basicPeopleid;
    }

    public void setBasicPeopleid(Integer basicPeopleid) {
        this.basicPeopleid = basicPeopleid;
    }

    public Integer getBasicCategoryid() {
        return basicCategoryid;
    }

    public void setBasicCategoryid(Integer basicCategoryid) {
        this.basicCategoryid = basicCategoryid;
    }

    public Integer getBasicAppid() {
        return basicAppid;
    }

    public void setBasicAppid(Integer basicAppid) {
        this.basicAppid = basicAppid;
    }

    public Integer getBasicModelid() {
        return basicModelid;
    }

    public void setBasicModelid(Integer basicModelid) {
        this.basicModelid = basicModelid;
    }

    public Integer getBasicComment() {
        return basicComment;
    }

    public void setBasicComment(Integer basicComment) {
        this.basicComment = basicComment;
    }

    public Integer getBasicCollect() {
        return basicCollect;
    }

    public void setBasicCollect(Integer basicCollect) {
        this.basicCollect = basicCollect;
    }

    public Integer getBasicShare() {
        return basicShare;
    }

    public void setBasicShare(Integer basicShare) {
        this.basicShare = basicShare;
    }

    public String getBasicType() {
        return basicType;
    }

    public void setBasicType(String basicType) {
        this.basicType = basicType == null ? null : basicType.trim();
    }

    public Integer getBasicDisplay() {
        return basicDisplay;
    }

    public void setBasicDisplay(Integer basicDisplay) {
        this.basicDisplay = basicDisplay;
    }

    public String getBasicDescription() {
        return basicDescription;
    }

    public void setBasicDescription(String basicDescription) {
        this.basicDescription = basicDescription == null ? null : basicDescription.trim();
    }
}