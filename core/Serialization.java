import java.io.*;
public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        B bin = new B();
        bin.a = 45; bin.b = 21; bin.b2 = 90; bin.co.c = 31;
        FileOutputStream fos = new FileOutputStream("test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(bin);
        oos.close();
        FileInputStream fis = new FileInputStream("test.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        B bout = (B) ois.readObject();
        System.out.println(bout.a + " " + bout.b + " " + bout.co.c + " " + bout.b2);
    }
}

class A { int a; }

class B extends A implements Serializable {
    C co = new C();
    int b;
    transient int b2;
}

class C implements Serializable { int c; }