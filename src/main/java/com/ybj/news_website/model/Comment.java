package com.ybj.news_website.model;

import java.util.Date;

public class Comment {
    private Integer id;

    private String content;

    private Date create_time;

    private Integer t_user_id;

    private Integer t_article_id;

    private Integer pid;

    private Integer reply_user_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getT_user_id() {
        return t_user_id;
    }

    public void setT_user_id(Integer t_user_id) {
        this.t_user_id = t_user_id;
    }

    public Integer getT_article_id() {
        return t_article_id;
    }

    public void setT_article_id(Integer t_article_id) {
        this.t_article_id = t_article_id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getReply_user_id() {
        return reply_user_id;
    }

    public void setReply_user_id(Integer reply_user_id) {
        this.reply_user_id = reply_user_id;
    }
}