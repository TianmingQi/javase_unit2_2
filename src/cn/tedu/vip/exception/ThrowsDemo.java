package cn.tedu.vip.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ��ʾthrows�ؼ��ֵ��÷�
 * @author Administrator
 */
public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            dosome();
        } catch (IOException e) {

        }

        try {
            work();
        } catch (NullPointerException e) {

        } catch (StringIndexOutOfBoundsException e) {

        }

        System.out.println("�������");
    }

    public static void dosome()throws IOException {
        FileOutputStream fos = new FileOutputStream("e:abc/aaa.txt");
        fos.write(1);
        fos.close();
    }

    public static void work()throws NullPointerException,StringIndexOutOfBoundsException{

        String  str = null;
        System.out.println(str.charAt(1));
    }
}
