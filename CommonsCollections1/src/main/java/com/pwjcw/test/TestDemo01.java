package com.pwjcw.test;

import org.apache.commons.collections.OrderedMap;
import org.apache.commons.collections.functors.InvokerTransformer;
import org.apache.commons.collections.map.LinkedMap;
import org.junit.Test;

import java.util.Map;

public class TestDemo01 {

    /**
     * 测试一下commons collections的功能
     */
    @Test
    public void testcc(){
        OrderedMap map=new LinkedMap();
        map.put("one","111");
        map.put("two",222);
        map.put("three",333);
        map.put("four",444);
        for (Object key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }

    }
    @Test
    public void testtransform(){
        Runtime runtime = Runtime.getRuntime();
        String MethodName="exec";
        Class[] paramTypes=new Class[]{String.class};
        Object[] arg=new Object[]{"calc"};

        InvokerTransformer invokerTransformer = new InvokerTransformer(MethodName, paramTypes, arg);
        invokerTransformer.transform(runtime);
    }
}
