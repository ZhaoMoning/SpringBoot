package com.easense.dingTalklogin.bean;

import java.util.Date;

public class BaseUser {
    private Long userid;

    private String usercode;

    private String username;

    private String useraccount;

    private String userpassword;

    private Long userorgid;

    private String usertype;

    private String userphone;

    private String useremail;

    private String userq;

    private String usera;

    private Date createdate;

    private Long createuserid;

    private Integer numberofuse;

    private Boolean deletemark;

    private String user1;

    private String user2;

    private String user3;

    private String user4;

    private Integer state;

    private String remarks;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount == null ? null : useraccount.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public Long getUserorgid() {
        return userorgid;
    }

    public void setUserorgid(Long userorgid) {
        this.userorgid = userorgid;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getUserq() {
        return userq;
    }

    public void setUserq(String userq) {
        this.userq = userq == null ? null : userq.trim();
    }

    public String getUsera() {
        return usera;
    }

    public void setUsera(String usera) {
        this.usera = usera == null ? null : usera.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Long getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Long createuserid) {
        this.createuserid = createuserid;
    }

    public Integer getNumberofuse() {
        return numberofuse;
    }

    public void setNumberofuse(Integer numberofuse) {
        this.numberofuse = numberofuse;
    }

    public Boolean getDeletemark() {
        return deletemark;
    }

    public void setDeletemark(Boolean deletemark) {
        this.deletemark = deletemark;
    }

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1 == null ? null : user1.trim();
    }

    public String getUser2() {
        return user2;
    }

    public void setUser2(String user2) {
        this.user2 = user2 == null ? null : user2.trim();
    }

    public String getUser3() {
        return user3;
    }

    public void setUser3(String user3) {
        this.user3 = user3 == null ? null : user3.trim();
    }

    public String getUser4() {
        return user4;
    }

    public void setUser4(String user4) {
        this.user4 = user4 == null ? null : user4.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}