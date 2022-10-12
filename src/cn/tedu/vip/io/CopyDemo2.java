package cn.tedu.vip.io;

import java.io.*;

/**
 * 使用缓冲流复制文件
 * 缓冲流
 * 缓冲流是一种高级流,提高文件流连接的读写速度
 * (内部以块读写的方式提高运行效率)
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        //高级流不能直接指向文件,它创建时需要低级流对象
        FileInputStream fis = new FileInputStream("Tik-Tok.m4a");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("Tik-Tok_copy2.m4a");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        long start = System.currentTimeMillis();
        int data;
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        long end = System.currentTimeMillis();

        System.out.println("over");
        System.out.println("复制用时:" + (end - start) + "ms");
        bis.close();
        bos.close();
    }
}
