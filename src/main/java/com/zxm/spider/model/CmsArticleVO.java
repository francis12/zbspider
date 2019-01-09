package com.zxm.spider.model;

public class CmsArticleVO {
    private Integer articleBasicid;

    private String articleAuthor;

    private String articleType;

    private String articleSource;

    private String articleUrl;

    private String articleKeyword;

    private Integer articleFreeorder;

    private Integer articleWebid;

    private String articleContent;

    public Integer getArticleBasicid() {
        return articleBasicid;
    }

    public void setArticleBasicid(Integer articleBasicid) {
        this.articleBasicid = articleBasicid;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor == null ? null : articleAuthor.trim();
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType == null ? null : articleType.trim();
    }

    public String getArticleSource() {
        return articleSource;
    }

    public void setArticleSource(String articleSource) {
        this.articleSource = articleSource == null ? null : articleSource.trim();
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl == null ? null : articleUrl.trim();
    }

    public String getArticleKeyword() {
        return articleKeyword;
    }

    public void setArticleKeyword(String articleKeyword) {
        this.articleKeyword = articleKeyword == null ? null : articleKeyword.trim();
    }

    public Integer getArticleFreeorder() {
        return articleFreeorder;
    }

    public void setArticleFreeorder(Integer articleFreeorder) {
        this.articleFreeorder = articleFreeorder;
    }

    public Integer getArticleWebid() {
        return articleWebid;
    }

    public void setArticleWebid(Integer articleWebid) {
        this.articleWebid = articleWebid;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }
}