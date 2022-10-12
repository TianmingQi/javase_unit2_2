package cn.tedu.vip.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("./raf.dat", "r");

        /*
        int read();
        从文件中读取一个字节的数据
        装载到int值得低八位数据上,并返回这个int值
        读到文件中没有任何内容的位置时,那么返回-1
        00000000 00000000 00000000 00000001
         */

        int d = raf.read();
        System.out.println(d);

        d = raf.read();
        System.out.println(d);
        raf.close();

    }
}
