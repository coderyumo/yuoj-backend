package com.yupi.yuoj.judge.codesandbox;

import com.yupi.yuoj.judge.codesandbox.strategy.DefaultJudgeStrategy;
import com.yupi.yuoj.judge.codesandbox.strategy.JavaLanguageJudgeStrategy;
import com.yupi.yuoj.judge.codesandbox.strategy.JudgeContext;
import com.yupi.yuoj.judge.codesandbox.strategy.JudgeStrategy;
import com.yupi.yuoj.model.dto.questionsubmit.JudgeInfo;
import com.yupi.yuoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * @description: 判题管理，简化调用
 * @author: yumo
 * @create: 2024-01-06 20:40
 **/
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    public JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }


}
