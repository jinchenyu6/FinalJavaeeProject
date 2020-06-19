package com.example.demo.controller;

import com.example.demo.model.Homework;
import com.example.demo.model.Student;
import com.example.demo.service.HomeworkService;
import com.example.demo.service.StudentHomeworkService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;

@Controller
public class TeacherController {

    @Autowired
    StudentService studentService;
    @Autowired
    HomeworkService homeworkService;
    @Autowired
    StudentHomeworkService studentHomeworkService;


    @RequestMapping(value = "/teacher",method = RequestMethod.GET)
    public ModelAndView Teacher(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/WEB-INF/jsp/Teacher.jsp");
        modelAndView.addObject("student",studentService.selectStudent());
        modelAndView.addObject("studentHomework",studentHomeworkService.selectStudentHomework());
        return modelAndView;
    }

    @RequestMapping(value = "/addHomework",method = RequestMethod.POST)
    public String addHomework(@RequestParam Long id,@RequestParam String title,@RequestParam String content){
        homeworkService.insertHomework(id, new EncodingTool().encodeStr(title), new EncodingTool().encodeStr(content));

        return "/WEB-INF/jsp/Teacher.jsp";
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

    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public String addStudent(@RequestParam Long studentId,@RequestParam String studentName){
        studentService.insertStudent(studentId, new EncodingTool().encodeStr(studentName));

        return "/WEB-INF/jsp/Teacher.jsp";
    }


    @RequestMapping(value = "/deleteStudentHomework",method = RequestMethod.POST)
    public String deleteStudentHomework(@RequestParam Long studentHomeworkId){
        studentHomeworkService.deleteStudentHomework(studentHomeworkId);
        return "/WEB-INF/jsp/Teacher.jsp";
    }

    @RequestMapping(value = "/updateStudent",method = RequestMethod.POST)
    public String updateStudent(@RequestParam Long studentId,@RequestParam String studentName){
        Student student = new Student();
        student.setId(studentId);
        student.setName(new EncodingTool().encodeStr(studentName));
        studentService.updateStudent(student);
        return "/WEB-INF/jsp/Teacher.jsp";
    }

    @RequestMapping(value = "/deleteStudent",method = RequestMethod.POST)
    public String deleteStudent(@RequestParam Long studentId){
     studentService.deleteStudent(studentId);
        return "/WEB-INF/jsp/Teacher.jsp";
    }

    @RequestMapping(value = "/deleteHomework",method = RequestMethod.POST)
    public String deleteHomework(@RequestParam Long homeworkId){
        homeworkService.deleteHomework(homeworkId);
        return "/WEB-INF/jsp/Teacher.jsp";
    }



    @RequestMapping(value = "/updateHomework",method = RequestMethod.POST)
    public String updateHomework(@RequestParam Long id,@RequestParam String title,@RequestParam String content){
        Homework homework = new Homework();
        homework.setId(id);
        homework.setTitle(new EncodingTool().encodeStr(title));
        homework.setContent(new EncodingTool().encodeStr(content));
        homeworkService.updateHomework(homework);
        return "/WEB-INF/jsp/Teacher.jsp";
    }



}
