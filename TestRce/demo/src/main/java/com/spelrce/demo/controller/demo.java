package com.spelrce.demo.controller;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
    @RequestMapping("/demo1")
    public Object demo(String poc){
        System.out.println(poc);
        // 创建 SpEL 表达式解析器
        ExpressionParser parser = new SpelExpressionParser();
        // 解析 SpEL 表达式，将字符串 poc 解析为一个可执行的 SpEL 表达式对象
        Expression exp = parser.parseExpression(poc);
        // 使用表达式对象获取表达式的值
        return  exp.getValue();
    }
}
