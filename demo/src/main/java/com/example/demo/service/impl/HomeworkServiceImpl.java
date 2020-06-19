package com.example.demo.service.impl;

import com.example.demo.dao.HomeworkMapper;
import com.example.demo.model.Homework;
import com.example.demo.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DELL
 */
@Service
public class HomeworkServiceImpl implements HomeworkService {

    @Autowired
    HomeworkMapper homeworkmapper;

    @Override
    public void insertHomework(Long homeworkId, String homeworkTitle, String homeworkContent){
      homeworkmapper.insertHomework(homeworkId,homeworkTitle,homeworkContent);
    }

    @Override
    public List<Homework> selectHomework(){
        return homeworkmapper.selectHomework();
    }

    public Homework findHomeworkById(int homeworkId){

        return homeworkmapper.findHomeworkById(homeworkId);
    }

    @Override
    public int updateHomework(Homework homework){
        return homeworkmapper.updateHomework(homework);
    }
    @Override
    public int deleteHomework(Long homeworkId){
        return homeworkmapper.deleteHomework(homeworkId);
    }

}
