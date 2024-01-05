package com.yupi.yuoj.mapper;

import com.yupi.yuoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
* @author yumo
* @description 针对表【question_submit(题目提交)】的数据库操作Mapper
* @createDate 2024-01-05 15:41:06
* @Entity com.yupi.yuoj.model.entity.QuestionSubmit
*/
@Mapper
public interface QuestionSubmitMapper extends BaseMapper<QuestionSubmit> {

}




