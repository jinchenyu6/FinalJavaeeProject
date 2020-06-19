package com.example.demo.service;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentmapper;

    public boolean insertStudent(Long stuid, String stuname){
        studentmapper.insertStudent(stuid,stuname);
        return true;
    }

    public List<Student> selectStudent(){
        return studentmapper.selectStudent();
    }

    public Student findStudentById(int stuid){

        return studentmapper.findStudentById(stuid);
    }

    public int updateStudent(Student student){
        return studentmapper.updateStudent(student);
    }
    public int deleteStudent(Long studentId){
        return studentmapper.deleteStudent(studentId);
    }
}
