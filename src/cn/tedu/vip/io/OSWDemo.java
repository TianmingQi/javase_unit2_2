package cn.tedu.vip.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");

        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
        String str = "��~�廷~����Ļ���һ��";

        osw.write(str);
        System.out.println("over");
        osw.close();
    }
}
