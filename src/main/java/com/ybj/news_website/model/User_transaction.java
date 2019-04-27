package com.ybj.news_website.model;

import java.util.Date;

public class User_transaction {
    private Integer transaction_id;

    private Integer user_id;

    private Integer to_user_id;

    private Date created_time;

    private Double expend_sum;

    private Double to_user_sum;

    private Double to_platform_sum;

    private Float rate;

    public Integer getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(Integer transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getTo_user_id() {
        return to_user_id;
    }

    public void setTo_user_id(Integer to_user_id) {
        this.to_user_id = to_user_id;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public Double getExpend_sum() {
        return expend_sum;
    }

    public void setExpend_sum(Double expend_sum) {
        this.expend_sum = expend_sum;
    }

    public Double getTo_user_sum() {
        return to_user_sum;
    }

    public void setTo_user_sum(Double to_user_sum) {
        this.to_user_sum = to_user_sum;
    }

    public Double getTo_platform_sum() {
        return to_platform_sum;
    }

    public void setTo_platform_sum(Double to_platform_sum) {
        this.to_platform_sum = to_platform_sum;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }
}