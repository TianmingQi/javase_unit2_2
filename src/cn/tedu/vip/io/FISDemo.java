package cn.tedu.vip.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 使用文件输出流读取文件中的内容
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        /*
        fis对象按顺序读取文件中的内容
         */
//        int data;
//        while ((data = fis.read())!=-1){
//            System.out.println(data);
//        }
        byte[] data = new byte[1024];

        int len = fis.read(data);
        System.out.println("读取到了" + len + "字节的内容");

        String str = new String(data, 0, len, "GBK");
        System.out.println(str);


//        int n = fis.read();
//        System.out.println(n);
    }
}
