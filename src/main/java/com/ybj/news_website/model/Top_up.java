package com.ybj.news_website.model;

import java.util.Date;

public class Top_up {
    private Integer top_up_id;

    private Integer user_id;

    private Date created_time;

    private Double money;

    private Double increased_balance;

    private String chaanel_id;

    private String exchange_rate;

    public Integer getTop_up_id() {
        return top_up_id;
    }

    public void setTop_up_id(Integer top_up_id) {
        this.top_up_id = top_up_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getIncreased_balance() {
        return increased_balance;
    }

    public void setIncreased_balance(Double increased_balance) {
        this.increased_balance = increased_balance;
    }

    public String getChaanel_id() {
        return chaanel_id;
    }

    public void setChaanel_id(String chaanel_id) {
        this.chaanel_id = chaanel_id == null ? null : chaanel_id.trim();
    }

    public String getExchange_rate() {
        return exchange_rate;
    }

    public void setExchange_rate(String exchange_rate) {
        this.exchange_rate = exchange_rate == null ? null : exchange_rate.trim();
    }
}