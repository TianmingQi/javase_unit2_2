package cn.tedu.vip.raf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        RandomAccessFile对象的创建
         */
        /*RandomAccessFile对象的权限
        r:只读模式
        rw:读写模式
        如果创建文件时使用的是读写模式
        那么这个文件会被创建
        如果使用只读模式会发生异常
         */
//        File f = new File("./raf.dat");
        RandomAccessFile raf = new RandomAccessFile("./raf.dat","rw");

        /*
        下面代码写入的内容是
        00000001
        raf.write(int d)
        功能是向指定文件中写入给定int值的
        2进制的低八位数据

        00000000 00000000 00000000 00000001


         */
        raf.write(48);
        System.out.println("over");
        raf.close();













    }
}
