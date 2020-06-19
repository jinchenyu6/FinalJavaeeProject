package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {
    void insertStudent(Long stuid, String stuname);
    List<Student> selectStudent();
    int updateStudent(Student student);
    int deleteStudent(Long studentId);
}
