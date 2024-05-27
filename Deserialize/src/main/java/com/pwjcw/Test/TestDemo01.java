package com.pwjcw.Test;

import com.pwjcw.entity.Persion;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestDemo01 {
    @Test
    public void TestSerialize() throws IOException {
        Persion persion = new Persion("pwjcw", 1);
        // 创建文件输出流，用于将对象序列化后的字节流写入文件
        FileOutputStream f = new FileOutputStream("persion.ser");
        // 创建对象输出流，用于将对象序列化后的数据写入文件
        ObjectOutputStream outputStream = new ObjectOutputStream(f);
        // 将 Person 对象进行序列化并写入文件
        outputStream.writeObject(persion);
        // 关闭对象输出流
        outputStream.close();
        // 关闭文件输出流
        f.close();
    }
}
