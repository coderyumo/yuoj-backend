package com.yupi.yuoj.judge;

import com.yupi.yuoj.model.entity.QuestionSubmit;

/**
 * @description:
 * @author: yumo
 * @create: 2024-01-06 19:14
 **/
public interface JudgeService {


    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);


}
