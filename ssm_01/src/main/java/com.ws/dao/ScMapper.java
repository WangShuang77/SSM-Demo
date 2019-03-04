package com.ws.dao;

import com.ws.domain.Sc;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author WangShuang
 * @Email xiaoshuang77@aliyun.com
 * @Description
 * @Date 2019/3/4
 */

public interface ScMapper extends Mapper<Sc> {

    @Select("select * from sc where sc.sid = #{sid}")
    @Results({
            @Result(property = "sid",column = "SID"),
            @Result(property = "cid",column = "CID"),
            @Result(property = "score",column = "SCORE"),
            @Result(property = "course",many = @Many(select = "com.ws.dao.CourseMapper.selectByPrimaryKey"),column = "CID"),

    })
    List<Sc> findBySid(@Param("sid") String sid);
}
