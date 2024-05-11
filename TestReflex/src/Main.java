import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //Class.forName 创建并加载指定的类
        Class<?> c = Class.forName("com.entity.Cat");
        //获取类的完整路径
        System.out.println(c.getName());
        //获取该类的全部属性，包括私有属性
        Field[] declaredFields = c.getDeclaredFields();
        for (Field field:declaredFields){
            System.out.println(field.getName());
        }
        //获取所有方法，包括私有方法
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method method:declaredMethods){
            System.out.println(method.getName());
        }
        //newInstance 创建对象,前提是该类一定要有无参构造函数
        Object o = c.newInstance();

        System.out.println(o);
    }
}