package com.yupi.yuoj.model.dto.question;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 判题配置
 * @author: yumo
 * @create: 2024-01-05 16:02
 **/
@Data
public class JudgeConfig implements Serializable {

    private static final long serialVersionUID = 5883106408531375909L;
    /**
     * 时间限制（ms）
     */
    private Long timeLimit;

    /**
     * 内存限制（kb）
     */
    private Long memoryLimit;

    /**
     * 堆栈限制（kb）
     */
    private Long stackLimit;

}
