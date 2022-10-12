package cn.tedu.vip.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 使用对象流反序列化操作
 * @author Tedu
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person p = (Person) ois.readObject();

        System.out.println(p);
        //输出结果中hobby=null,因为hobby别transient关键字修饰，不参与序列化,
        //所以反序列化无法提取
        ois.close();
    }
}
