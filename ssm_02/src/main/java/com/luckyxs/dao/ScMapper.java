package com.luckyxs.dao;

import com.luckyxs.domain.Sc;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/3/4
 */
public interface ScMapper extends Mapper<Sc> {

    @Select("select * from sc where sc.sid = #{sid}")
    @Results({
            @Result(property = "sid",column = "SID"),
            @Result(property = "cid",column = "CID"),
            @Result(property = "score",column = "SCORE"),
            @Result(property = "course",many = @Many(select = "com.luckyxs.dao.CourseMapper.selectByPrimaryKey")
                    ,column = "CID"),
    })
    public List<Sc> findBySid(@Param("sid") String sid);


}
