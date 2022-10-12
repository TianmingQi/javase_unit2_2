package cn.tedu.vip.exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class AutoClosedDemo {
    public static void main(String[] args) {
        try (
                /*
                ������ʵ����Autocloseable�ӿڵ�������Զ�����close

                �������Ǳ������ڱ������ʱ,��try()�����Դ�����Զ���
                ����ر�,����finally��λ��ִ��
                 */
                FileOutputStream fos = new FileOutputStream("e:/aaa/abc.txt");
                OutputStreamWriter osw = new OutputStreamWriter(fos);
        ) {
            osw.write(1);
        } catch (IOException e) {
            System.out.println("������");
        }

        System.out.println("�������");
    }
}
