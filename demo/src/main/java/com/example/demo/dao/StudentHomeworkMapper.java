package com.example.demo.dao;

import com.example.demo.model.StudentHomework;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentHomeworkMapper {

    List<StudentHomework> selectStudentHomework();

    public void insertStudentHomework(@Param("studentId") Long studentId, @Param("homeworkId") Long homeworkId, @Param("homeworkTitle") String homeworkTitle, @Param("homeworkContent") String homeworkContent);

    StudentHomework findStudentHomeworkById(Long studentId);

    int updateStudentHomework(StudentHomework studentHomework);

    int deleteStudentHomework(Long studentHomeworkId);
}

