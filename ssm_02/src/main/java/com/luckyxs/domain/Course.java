package com.luckyxs.domain;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/3/4
 */
@Table(name = "course")
public class Course {

    @Id
    private String cid;
    private String cname;
    private String tid;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }
}
