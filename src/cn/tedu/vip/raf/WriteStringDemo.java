package cn.tedu.vip.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {

        RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
        String str = "左边~跟我一起画个龙";
        byte[] data = str.getBytes("utf-8");
        raf.write(data);
        System.out.println("over");
        raf.close();

    }
}
