package com.yupi.yuoj.judge.codesandbox;

import com.yupi.yuoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.yuoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.yupi.yuoj.model.enums.QuestionSubmitLanguageEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CodeSandboxTest {

    @Value("${codesandbox.value}")
    private String type;

    @Test
    void test01(){
        CodeSandbox codeSandbox = CodeSandboxFactory.newInstance(type);
        String code = "int main()";
        String language = QuestionSubmitLanguageEnum.JAVA.getValue();
        ExecuteCodeRequest executeCodeRequest =  ExecuteCodeRequest.builder()
                .code(code)
                .language(language)
                .build();
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        Assertions.assertNotNull(executeCodeResponse);
    }

    @Test
    void codeSandboxProxy(){
        CodeSandbox codeSandbox = CodeSandboxFactory.newInstance(type);
        codeSandbox = new CodeSandboxProxy(codeSandbox);
        String code = "public class Main {\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        int a = Integer.parseInt(args[0]);\n" +
                "        int b = Integer.parseInt(args[1]);\n" +
                "        System.out.println(\"结果:\" + (a + b));\n" +
                "    }\n" +
                "\n" +
                "}";
        List<String> inputString = Arrays.asList("1 2","1 3");
        String language = QuestionSubmitLanguageEnum.JAVA.getValue();
        ExecuteCodeRequest executeCodeRequest =  ExecuteCodeRequest.builder()
                .code(code)
                .inputList(inputString)
                .language(language)
                .build();
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        Assertions.assertNotNull(executeCodeResponse);
    }


}