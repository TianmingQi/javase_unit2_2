package cn.tedu.vip.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ʹ�ö����������л�����
 * @author Tedu
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person p = (Person) ois.readObject();

        System.out.println(p);
        //��������hobby=null,��Ϊhobby��transient�ؼ������Σ����������л�,
        //���Է����л��޷���ȡ
        ois.close();
    }
}
