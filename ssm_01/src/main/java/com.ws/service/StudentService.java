package com.ws.service;

import com.ws.dao.StudentMapper;
import com.ws.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author WangShuang
 * @Email xiaoshuang77@aliyun.com
 * @Description
 * @Date 2019/3/4
 */
@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> findAllStudent(){

        List<Student> studentList = studentMapper.findAllStudent();
        return studentList;
    }

}
