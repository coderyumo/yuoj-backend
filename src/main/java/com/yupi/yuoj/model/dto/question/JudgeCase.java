package com.yupi.yuoj.model.dto.question;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 判题用例
 * @author: yumo
 * @create: 2024-01-05 16:02
 **/
@Data
public class JudgeCase implements Serializable {

    private static final long serialVersionUID = 8778532697891122069L;

    /**
     * 输出用例
     */
    private String input;

    /**
     * 输入用例
     */
    private String output;
}
