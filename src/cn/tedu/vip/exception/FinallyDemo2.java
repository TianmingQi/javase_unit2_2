package cn.tedu.vip.exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO�������쳣���Ƶı�д
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        System.out.println("����ʼ");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("e:/abc/aaa.txt");
            fos.write(1);
        } catch (IOException e) {
            System.out.println("������");
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("�رճ����쳣");
            }
        }


        System.out.println("�������");
    }
}
