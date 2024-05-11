import org.junit.Test;
import sun.nio.cs.ext.GBK;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestRce {
    @Test
    public void Test1() throws IOException {
        String cmd ="ipconfig /all";
        Process exec = Runtime.getRuntime().exec(cmd);
        // 读取命令执行的结果并打印输出
        BufferedReader reader = new BufferedReader(new InputStreamReader(exec.getInputStream(), Charset.forName("GBK")));
        String line;
        System.out.println("命令执行结果：");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        // 关闭输入流
        reader.close();
    }

    @Test
    public void Test2() throws IOException {
        String [] cmds={"ipconfig","/all"};
        Process exec = Runtime.getRuntime().exec(cmds);
        // 读取命令执行的结果并打印输出
        BufferedReader reader = new BufferedReader(new InputStreamReader(exec.getInputStream(), Charset.forName("GBK")));
        String line;
        System.out.println("命令执行结果：");
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        // 关闭输入流
        reader.close();
    }
    @Test
    public void Test3(){

    }
}
