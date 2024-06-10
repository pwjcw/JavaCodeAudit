package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Test;

import java.lang.annotation.Target;

public class TestFastJson {
    @Test
    public void test1(){
        Student student = new Student("张三", 20, "aaaaa");
        String jsonString = JSON.toJSONString(student);
        //讲java对象进行序列化为json字符串
        System.out.println(jsonString);
        //讲javc对象序列化为json字符串，并且将类名也序列化其中
        String jsonString1 = JSON.toJSONString(student, SerializerFeature.WriteClassName);
        System.out.println(jsonString1);
    }
}
