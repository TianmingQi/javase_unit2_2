package cn.tedu.vip.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流,用于对象的序列化和反序列化
 * 对象流也是高级流
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        Person p = new Person("齐天明", 21, "男", new String[]{"吃饭", "睡觉", "打豆豆", "演戏"});

        //创建低级流
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        /*
        要序列化的对象必须实现可序列化的接口
        否则在进行序列化时会报错
        1.对象流会将指定的对象转换为一组字节
        这个过程称之为序列化
        2.将序列化后的这组字节写到流对象指定的硬盘路径上
        这个过程称之为数据持久化
         */
        oos.writeObject(p);
        System.out.println("over");
        oos.close();
    }
}
