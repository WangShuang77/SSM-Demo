package com.ws.dao;

import com.ws.domain.Student;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author WangShuang
 * @Email xiaoshuang77@aliyun.com
 * @Description
 * @Date 2019/3/4
 */

public interface StudentMapper  extends Mapper<Student> {

    @Select("select * from student ")
    @Results({

            @Result(property = "sid",column = "SID"),
            @Result(property = "sname",column = "SNAME"),
            @Result(property = "sage",column = "SAGE"),
            @Result(property = "ssex",column = "SSEX"),
            @Result(property = "sc",many = @Many(select = "com.ws.dao.ScMapper.findBySid"),column = "SID"),

    })
    List<Student> findAllStudent();
}
