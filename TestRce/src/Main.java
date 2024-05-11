import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Rce1();
    }

    public static void Rce1() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入命令:");
        String cmd = scanner.nextLine();
        Process exec = Runtime.getRuntime().exec(cmd);
    }
}