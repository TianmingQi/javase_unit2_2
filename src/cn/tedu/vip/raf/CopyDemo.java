package cn.tedu.vip.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        //负责读数据的raf
        RandomAccessFile rafRead = new RandomAccessFile("最伟大的作品.m4a","r");
        //负责写入的raf
        RandomAccessFile rafWrite = new RandomAccessFile("./最伟大的作品_cp.m4a","rw");

        //声明一个字节(只使用低八位)
        int d;
        long start = System.currentTimeMillis();
        while((d = rafRead.read())!=-1){
            rafWrite.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("用时:"+(end-start)+"ms");
        rafRead.close();
        rafWrite.close();

    }
}
