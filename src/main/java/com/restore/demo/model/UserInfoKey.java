package com.restore.demo.model;

import java.io.Serializable;

public class UserInfoKey implements Serializable {
    private String useraccount;

    private Integer userid;

    private static final long serialVersionUID = 1L;

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount == null ? null : useraccount.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}