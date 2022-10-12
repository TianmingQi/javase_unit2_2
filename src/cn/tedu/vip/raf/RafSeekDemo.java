package cn.tedu.vip.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RafSeekDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("data.dat","rw");

        //获取指针当前的位置
        long pos = raf.getFilePointer();
        System.out.println(raf.getFilePointer());
        int max = Integer.MAX_VALUE;
        raf.write(max>>>24);
        System.out.println(raf.getFilePointer());
        raf.write(max>>>16);
        System.out.println(raf.getFilePointer());
        raf.write(max>>>8);
        System.out.println(raf.getFilePointer());
        raf.write(max);
        System.out.println(raf.getFilePointer());

        //直接写一个int数据
        raf.writeInt(max);
        System.out.println(raf.getFilePointer());
        raf.writeLong(123L);
        System.out.println(raf.getFilePointer());
        raf.writeDouble(121.125);
        System.out.println(raf.getFilePointer());


        raf.seek(0);
        int data = raf.read();
        System.out.println(data);

        raf.seek(4);
        int i = raf.readInt();
        long l = raf.readLong();
        double d = raf.readDouble();
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);

        System.out.println("over");
        raf.close();
    }
}
