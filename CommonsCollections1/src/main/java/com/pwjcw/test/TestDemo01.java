package com.pwjcw.test;

import org.apache.commons.collections.OrderedMap;
import org.apache.commons.collections.map.LinkedMap;
import org.junit.Test;

import java.util.Map;

public class TestDemo01 {
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
}
