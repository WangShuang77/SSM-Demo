package com.luckyxs.dao;

import com.luckyxs.domain.Student;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/3/4
 */
public interface StudentMapper extends Mapper<Student> {
    @Select("select * from student s")
    @Results({
            @Result(property = "sid",column = "SID"),
            @Result(property = "sname",column = "SNAME"),
            @Result(property = "sage",column = "SAGE"),
            @Result(property = "ssex",column = "SSEX"),
            @Result(property = "sc",many = @Many(select = "com.luckyxs.dao.ScMapper.findBySid") ,column = "SID"),
    })
    List<Student> findAllStudent();
}
