package com.example.demo.service;

import com.example.demo.model.Homework;

import java.util.List;

public interface HomeworkService {

    void insertHomework(Long homeworkId, String homeworkTitle, String homeworkContent);

    List<Homework> selectHomework();

    int updateHomework(Homework homework);

    int deleteHomework(Long homeworkId);
}
