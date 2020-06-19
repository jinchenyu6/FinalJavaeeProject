package com.example.demo.controller;

import com.example.demo.model.StudentHomework;
import com.example.demo.service.HomeworkService;
import com.example.demo.service.StudentHomeworkService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;

@Controller

public class StudentController {

    @Autowired
    StudentHomeworkService studentHomeworkService;
    @Autowired
    HomeworkService homeworkService;
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ModelAndView Student(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/jsp/Student.jsp");
        modelAndView.addObject("homework",homeworkService.selectHomework());
        modelAndView.addObject("student",studentService.selectStudent());
        return modelAndView;
    }



    @RequestMapping(value = "/addStudentHomework",method = RequestMethod.POST)
    public String addStudentHomework(@RequestParam Long studentId,@RequestParam Long homeworkId,@RequestParam String homeworkTitle,@RequestParam String homeworkContent){
        studentHomeworkService.insertStudentHomework(studentId,homeworkId, new StudentController.EncodingTool().encodeStr(homeworkTitle),new StudentController.EncodingTool().encodeStr(homeworkContent));

        return "/WEB-INF/jsp/Student.jsp";
    }

    //requestParam转码
    public class EncodingTool {
        String encodeStr(String str) {
            try {
                return new String(str.getBytes("ISO-8859-1"), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return null;
            }

        }
    }

    @RequestMapping(value = "/updateStudentHomework",method = RequestMethod.POST)
    public String updateStudentHomework(@RequestParam Long studentId,@RequestParam Long homeworkId,@RequestParam String homeworkTitle,@RequestParam String homeworkContent){
        StudentHomework studentHomework = new StudentHomework();
        studentHomework.setStudentId(studentId);
        studentHomework.setHomeworkId(homeworkId);
        studentHomework.setHomeworkTitle(new StudentController.EncodingTool().encodeStr(homeworkTitle));
        studentHomework.setHomeworkContent(new StudentController.EncodingTool().encodeStr(homeworkContent));
        studentHomeworkService.updateStudentHomework(studentHomework);

        return "/WEB-INF/jsp/Student.jsp";
    }



}
