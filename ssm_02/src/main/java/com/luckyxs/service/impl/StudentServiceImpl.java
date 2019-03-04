package com.luckyxs.service.impl;

import com.luckyxs.dao.StudentMapper;
import com.luckyxs.domain.Student;
import com.luckyxs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/3/4
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> findAllStudent() {
        List<Student> students = studentMapper.findAllStudent();
        return students;
    }
}
