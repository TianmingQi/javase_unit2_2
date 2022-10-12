package cn.tedu.vip.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用IO完成复制
 */
public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        1.创建文件输入流,读取源文件
        2.创建文件输出流,复制出新文件
        3.循环从源文件中读取信息写到新文件中
        4.写完记住关闭操作
         */
        FileInputStream fis = new FileInputStream("Tik-Tok.m4a");
        FileOutputStream fos = new FileOutputStream("Tik-Tok_copy.m4a");

        byte[] data = new byte[1024 * 10];//定义一个10K缓存
        int len;
        long start = System.currentTimeMillis();
        while ((len = fis.read(data)) != -1) {
            fos.write(data, 0, len);
        }
        long end = System.currentTimeMillis();
        System.out.println("over");
        System.out.println("复制用时:" + (end - start) + "ms");
        fis.close();
        fos.close();


    }
}
