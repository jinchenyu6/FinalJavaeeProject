package com.example.demo.service;

import com.example.demo.mapper.HomeworkMapper;
import com.example.demo.entity.Homework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeworkService {

    @Autowired
    HomeworkMapper homeworkmapper;

    public boolean insertHomework(Long homeworkId, String homeworkTitle, String homeworkContent){
        homeworkmapper.insertHomework(homeworkId,homeworkTitle,homeworkContent);
        return true;
    }

    public List<Homework> selectHomework(){
        return homeworkmapper.selectHomework();
    }

    public Homework findHomeworkById(int homeworkId){

        return homeworkmapper.findHomeworkById(homeworkId);
    }

    public int updateHomework(Homework homework){
        return homeworkmapper.updateHomework(homework);
    }
    public int deleteHomework(Long homeworkId){
        return homeworkmapper.deleteHomework(homeworkId);
    }

}
