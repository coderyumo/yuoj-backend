package com.yupi.yuoj.judge.codesandbox.strategy;

import com.yupi.yuoj.model.dto.questionsubmit.JudgeInfo;

/**
 * @description: 判题策略
 * @author: yumo
 * @create: 2024-01-06 20:05
 **/
public interface JudgeStrategy {


    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);


}
