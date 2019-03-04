package com.ws.domain;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author WangShuang
 * @Email xiaoshuang77@aliyun.com
 * @Description
 * @Date 2019/3/4
 */
@Table(name = "SC")
public class Sc {

    @Id
    private String sid;

    @Id
    private String cid;

    private Double score;

    private Course course;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
