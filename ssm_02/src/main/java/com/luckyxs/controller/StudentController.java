package com.luckyxs.controller;

import com.luckyxs.domain.Student;
import com.luckyxs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
/**
 * @Author WangShuang
 * @Email xiaoshuang77@aliyun.com
 * @Date 2019/03/04
 * @Description 默认扫描包下的路径需要修改
 */
@RequestMapping("student")
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("find")
    public String findAllStudent(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception {
        // 查询学生信息和成绩
        List<Student> list = studentService.findAllStudent();
        System.out.println(list.get(1).getSc());
        request.setAttribute("aa","xxx");
        session.setAttribute("aa","session");
        request.setAttribute("list",list);
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("hello");
//        modelAndView.addObject("msg","springMVC的页面输出！");
        return "forward:/find.jsp";
    }
}

