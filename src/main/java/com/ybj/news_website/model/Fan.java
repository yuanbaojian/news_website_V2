package com.ybj.news_website.model;

import java.util.Date;

public class Fan {
    private Integer user_id;

    private Integer fan_id;

    private Date created_time;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getFan_id() {
        return fan_id;
    }

    public void setFan_id(Integer fan_id) {
        this.fan_id = fan_id;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }
}