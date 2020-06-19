package com.example.demo.mapper;

import com.example.demo.entity.Homework;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeworkMapper {

    List<Homework> selectHomework();

    public void insertHomework(@Param("homeworkId") Long homeworkId, @Param("homeworkTitle")String homeworkTitle,@Param("homeworkContent")String homeworkContent);

    Homework findHomeworkById(int homeworkId);

    int updateHomework(Homework homework);

    int deleteHomework(Long homeworkId);
}

