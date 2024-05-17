import org.Reflex.entity.User;
import org.junit.Test;

import java.lang.reflect.Field;

public class TestReflex {
    @Test
    public void testStart() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        User user = new User();
        //第一种方法
        Class<?> aClass = Class.forName("com.entity.User");
        //第二种方法
        Class<? extends User> aClass1 = user.getClass();
        //第三种方法
        Class<User> userClass = User.class;
        User user1 = (User) aClass.newInstance();
        user1.setUser_phone("aaaaa");
        System.out.println(user1.getUser_phone());
    }
    @Test
    public void testFields() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        User user = new User();
        Class<?> aClass = Class.forName("com.entity.User");
        //获取所有的属性
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field f:declaredFields){
            System.out.println("属性名:"+f.getName()); //依次打印属性名
        }
        //获取指定属性


    }
}
