import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObject();
    }

    public static void readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("test.session"));
        objectInputStream.readObject();
        objectInputStream.close();
    }
    public static  void writeObject() throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("test.session");
        Demo demo1=new Demo();
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(demo1);
        objectOutputStream.close();
        fileOutputStream.close();
    }
}