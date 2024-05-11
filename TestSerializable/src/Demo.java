import java.io.IOException;
import java.io.Serializable;

public class Demo implements Serializable {
    //重写readObject方法
    private void readObject(java.io.ObjectInputStream in) throws ClassNotFoundException,  IOException {
        //执行默认的readObject()方法
        in.defaultReadObject();
        //执行打开计算器程序命令
        Runtime.getRuntime().exec("echo 5555 >/test");
    }
}
