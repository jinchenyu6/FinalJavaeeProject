package com.example.demo.service;

import com.example.demo.mapper.StudentHomeworkMapper;
import com.example.demo.entity.StudentHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentHomeworkService {

    @Autowired
    StudentHomeworkMapper studentHomeworkmapper;
    public boolean insertStudentHomework(Long studentId, Long homeworkId, String homeworkTitle, String homeworkContent){
        studentHomeworkmapper.insertStudentHomework(studentId,homeworkId,homeworkTitle,homeworkContent);
        return true;
    }

    public List<StudentHomework> selectStudentHomework(){
        return studentHomeworkmapper.selectStudentHomework();
    }

    public StudentHomework findStudentHomeworkById(Long id){

       return studentHomeworkmapper.findStudentHomeworkById(id);
    }

    public int updateStudentHomework(StudentHomework studentHomework){
        return studentHomeworkmapper.updateStudentHomework(studentHomework);
    }

    public int deleteStudentHomework(Long id){
        return studentHomeworkmapper.deleteStudentHomework(id);
    }
}
