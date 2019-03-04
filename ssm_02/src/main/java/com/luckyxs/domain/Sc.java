package com.luckyxs.domain;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/3/4
 */
@Table(name = "SC")
public class Sc {

    @Id
    private String sid;
    @Id
    private String cid;
    private Double score;

    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

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
}
