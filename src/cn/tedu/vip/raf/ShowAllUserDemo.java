package cn.tedu.vip.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ShowAllUserDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("user.dat", "r");
        for (int i = 0; i < raf.length() / 100; i++) {
            byte[] data = new byte[32];
            //读取第一个32字节
            raf.read(data);
            String name = new String(data, "utf-8");
            System.out.println(raf.getFilePointer());//32

            //读取下一个32字节
            raf.read(data);
            String pwd = new String(data, "utf-8");
            System.out.println(raf.getFilePointer());//64
            //读取下一个32字节
            raf.read(data);
            String nick = new String(data, "utf-8");
            System.out.println(raf.getFilePointer());//96

            int age = raf.readInt();
            System.out.println(raf.getFilePointer());//100

            System.out.println(name + "," + pwd + "," + nick + "," + age);

        }
        System.out.println("over");
        raf.close();
    }
}
