package com.example.demo.service;

import com.example.demo.model.StudentHomework;

import java.util.List;

public interface StudentHomeworkService {
    void insertStudentHomework(Long studentId, Long homeworkId, String homeworkTitle, String homeworkContent);
    List<StudentHomework> selectStudentHomework();
    int updateStudentHomework(StudentHomework studentHomework);
    int deleteStudentHomework(Long id);
}
