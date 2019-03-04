package com.luckyxs.domain;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/3/4
 */
@Table(name = "student")
public class Student {

    @Id
    private String sid;
    private String sname;
    private Date sage;
    private String ssex;

    private List<Sc> sc;

    public List<Sc> getSc() {
        return sc;
    }

    public void setSc(List<Sc> sc) {
        this.sc = sc;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getSage() {
        return sage;
    }

    public void setSage(Date sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }
}
