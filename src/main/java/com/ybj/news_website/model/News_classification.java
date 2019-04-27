package com.ybj.news_website.model;

public class News_classification {
    private Integer classification_id;

    private String classification_name;

    public Integer getClassification_id() {
        return classification_id;
    }

    public void setClassification_id(Integer classification_id) {
        this.classification_id = classification_id;
    }

    public String getClassification_name() {
        return classification_name;
    }

    public void setClassification_name(String classification_name) {
        this.classification_name = classification_name == null ? null : classification_name.trim();
    }
}