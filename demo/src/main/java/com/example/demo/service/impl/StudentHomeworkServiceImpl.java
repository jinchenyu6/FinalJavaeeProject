package com.example.demo.service.impl;

import com.example.demo.dao.StudentHomeworkMapper;
import com.example.demo.model.StudentHomework;
import com.example.demo.service.StudentHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentHomeworkServiceImpl implements StudentHomeworkService {

    @Autowired
    StudentHomeworkMapper studentHomeworkmapper;
    @Override
    public void insertStudentHomework(Long studentId, Long homeworkId, String homeworkTitle, String homeworkContent){
        studentHomeworkmapper.insertStudentHomework(studentId,homeworkId,homeworkTitle,homeworkContent);
    }

    @Override
    public List<StudentHomework> selectStudentHomework(){
        return studentHomeworkmapper.selectStudentHomework();
    }

    public StudentHomework findStudentHomeworkById(Long id){

       return studentHomeworkmapper.findStudentHomeworkById(id);
    }

    @Override
    public int updateStudentHomework(StudentHomework studentHomework){
        return studentHomeworkmapper.updateStudentHomework(studentHomework);
    }

    @Override
    public int deleteStudentHomework(Long id){
        return studentHomeworkmapper.deleteStudentHomework(id);
    }
}
