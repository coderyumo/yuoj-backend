package com.yupi.yuoj.judge.codesandbox.strategy;

import com.yupi.yuoj.model.dto.question.JudgeCase;
import com.yupi.yuoj.judge.codesandbox.model.JudgeInfo;
import com.yupi.yuoj.model.entity.Question;
import com.yupi.yuoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: yumo
 * @create: 2024-01-06 20:07
 **/
@Data
public class JudgeContext {

    /**
     * 判题信息
     */
    private JudgeInfo judgeInfo;

    /**
     * 输入用例
     */
    private List<String> inputList;

    /**
     * 输出用例
     */
    private List<String> outputList;

    /**
     * 题目信息
     */
    private Question question;

    /**
     * 题目信息
     */
    private QuestionSubmit questionSubmit;

    /**
     * 判题用例
     */
    private List<JudgeCase> judgeCaseList;
}
