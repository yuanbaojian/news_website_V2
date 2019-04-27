package com.ybj.news_website.model;

import java.util.Date;

public class Role {
    private Integer role_id;

    private String role_name;

    private Date role_created_time;

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name == null ? null : role_name.trim();
    }

    public Date getRole_created_time() {
        return role_created_time;
    }

    public void setRole_created_time(Date role_created_time) {
        this.role_created_time = role_created_time;
    }
}