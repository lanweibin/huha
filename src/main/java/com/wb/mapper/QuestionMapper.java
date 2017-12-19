package com.wb.mapper;

import com.wb.model.Question;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface QuestionMapper {
    int selectQuestionCountByUserId(@Param("userId") Integer userId);

    List<Question> listQuestionByUserId(Map<String, Object> map);
}
