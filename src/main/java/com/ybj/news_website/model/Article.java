package com.ybj.news_website.model;

import java.util.Date;

public class Article {
    private Integer article_id;

    private Date article_created_time;

    private String article_img1;

    private String article_img2;

    private String article_img3;

    private String article_img4;

    private String article_img5;

    private Integer classification_id;

    private Integer user_id;

    private Integer checked;

    private String article_context;

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public Date getArticle_created_time() {
        return article_created_time;
    }

    public void setArticle_created_time(Date article_created_time) {
        this.article_created_time = article_created_time;
    }

    public String getArticle_img1() {
        return article_img1;
    }

    public void setArticle_img1(String article_img1) {
        this.article_img1 = article_img1 == null ? null : article_img1.trim();
    }

    public String getArticle_img2() {
        return article_img2;
    }

    public void setArticle_img2(String article_img2) {
        this.article_img2 = article_img2 == null ? null : article_img2.trim();
    }

    public String getArticle_img3() {
        return article_img3;
    }

    public void setArticle_img3(String article_img3) {
        this.article_img3 = article_img3 == null ? null : article_img3.trim();
    }

    public String getArticle_img4() {
        return article_img4;
    }

    public void setArticle_img4(String article_img4) {
        this.article_img4 = article_img4 == null ? null : article_img4.trim();
    }

    public String getArticle_img5() {
        return article_img5;
    }

    public void setArticle_img5(String article_img5) {
        this.article_img5 = article_img5 == null ? null : article_img5.trim();
    }

    public Integer getClassification_id() {
        return classification_id;
    }

    public void setClassification_id(Integer classification_id) {
        this.classification_id = classification_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getChecked() {
        return checked;
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    public String getArticle_context() {
        return article_context;
    }

    public void setArticle_context(String article_context) {
        this.article_context = article_context == null ? null : article_context.trim();
    }
}