import com.entity.Cat;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo2 {
    public static  void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        m2();
        m1();
    }

    public static void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("com.entity.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        //关闭安全检查,主要用与提升性能
        hi.setAccessible(true);
        long start= System.currentTimeMillis();
        for (int i=0;i<90000000;i++){
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射耗时:"+(end-start));


    }
    public static void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i=0;i<90000000;i++){
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("正常调用耗时:"+(end-start));
    }
}
