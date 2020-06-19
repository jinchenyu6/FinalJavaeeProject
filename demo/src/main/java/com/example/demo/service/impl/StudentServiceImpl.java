package com.example.demo.service.impl;

import com.example.demo.dao.StudentMapper;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentmapper;

    @Override
    public void insertStudent(Long stuid, String stuname){
        studentmapper.insertStudent(stuid,stuname);
    }

    @Override
    public List<Student> selectStudent(){
        return studentmapper.selectStudent();
    }

    public Student findStudentById(int stuid){

        return studentmapper.findStudentById(stuid);
    }

    @Override
    public int updateStudent(Student student){
        return studentmapper.updateStudent(student);
    }
    @Override
    public int deleteStudent(Long studentId){
        return studentmapper.deleteStudent(studentId);
    }
}
