package com.yupi.yuoj.judge.codesandbox.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 判题信息
 * @author: yumo
 * @create: 2024-01-05 16:02
 **/
@Data
public class JudgeInfo implements Serializable {

    private static final long serialVersionUID = 8742067650794814246L;

    /**
     * 程序执行的信息
     */
    private String message;

    /**
     * 执行消耗的内存
     */
    private Long memory;

    /**
     * 执行消耗时间
     */
    private Long time;
}
