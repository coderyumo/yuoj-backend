package com.yupi.yuoj.mapper;

import com.yupi.yuoj.model.entity.Question;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
* @author yumo
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2024-01-05 15:40:08
* @Entity com.yupi.yuoj.model.entity.Question
*/
@Mapper
public interface QuestionMapper extends BaseMapper<Question> {

}




