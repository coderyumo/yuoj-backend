package com.yupi.yuoj.judge.codesandbox.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.yupi.yuoj.common.ErrorCode;
import com.yupi.yuoj.exception.BusinessException;
import com.yupi.yuoj.judge.codesandbox.CodeSandbox;
import com.yupi.yuoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.yuoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @description: 远程调用代码沙箱
 * @author: yumo
 * @create: 2024-01-06 18:21
 **/
public class RemoteCodeSandbox implements CodeSandbox {

    private static final String AUTH_REQUEST_HEADER = "auth";

    private static final String AUTH_REQUEST_SECRET = "secretKey";


    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程调用代码沙箱");
        String url = "http://localhost:8102/executeCode";
        String json = JSONUtil.toJsonStr(executeCodeRequest);
        String responseStr = HttpUtil.createPost(url)
                .header(AUTH_REQUEST_HEADER,AUTH_REQUEST_SECRET)
                .body(json)
                .execute()
                .body();
        if (StrUtil.isBlank(responseStr)){
            throw new BusinessException(ErrorCode.API_REQUEST_ERROR.getCode(),"executeCode RemoteCodeSandbox error," +
                    "message"+responseStr);
        }
        return JSONUtil.toBean(responseStr,ExecuteCodeResponse.class);
    }
}
