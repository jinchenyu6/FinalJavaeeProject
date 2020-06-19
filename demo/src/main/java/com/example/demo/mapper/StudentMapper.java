package com.example.demo.mapper;

import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

    List<Student> selectStudent();
    public void insertStudent(@Param("id") Long id, @Param("name")String name);

    Student findStudentById(int id);

    int updateStudent(Student student);

    int deleteStudent(Long studentId);
}
