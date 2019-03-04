package com.ws.controller;

import com.ws.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ws.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author WangShuang
 * @Email xiaoshuang77@aliyun.com
 * @Description
 * @Date 2019/3/4
 */
@RequestMapping("student")
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("find")
    public String findAllStudent(HttpServletRequest request, HttpSession session , HttpServletResponse response) throws  Exception{

        //查询学生信息和成绩
        List<Student> list = studentService.findAllStudent();
        System.out.println(list.get(1).getSc());
        request.setAttribute("aa","xx");
        session.setAttribute("aa","session");
        request.setAttribute("list",list);
        return "forward:/find.jsp";
    }
}
