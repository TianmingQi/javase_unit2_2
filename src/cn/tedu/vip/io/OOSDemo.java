package cn.tedu.vip.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ������,���ڶ�������л��ͷ����л�
 * ������Ҳ�Ǹ߼���
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        Person p = new Person("������", 21, "��", new String[]{"�Է�", "˯��", "�򶹶�", "��Ϸ"});

        //�����ͼ���
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        /*
        Ҫ���л��Ķ������ʵ�ֿ����л��Ľӿ�
        �����ڽ������л�ʱ�ᱨ��
        1.�������Ὣָ���Ķ���ת��Ϊһ���ֽ�
        ������̳�֮Ϊ���л�
        2.�����л���������ֽ�д��������ָ����Ӳ��·����
        ������̳�֮Ϊ���ݳ־û�
         */
        oos.writeObject(p);
        System.out.println("over");
        oos.close();
    }
}
