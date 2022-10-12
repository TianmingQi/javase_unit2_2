package cn.tedu.vip.raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成用户注册功能
 * 将一个用户信息保存到一个文件中
 * 这个文件可以保存多个用户信息
 * 程序运行一次保存:
 * 一个用户名(String) 密码(String) 昵称(String) 年龄(int)
 * 每个用户信息占用100字节
 * 其中每个字符串信息占32字节,年龄占4字节
 */
public class RegDemo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("开始注册,请输入您的信息:");
        System.out.println("请输入用户名:");
        String name = scan.nextLine();
        System.out.println("请输入密码:");
        String pwd = scan.nextLine();
        System.out.println("请输入昵称:");
        String nick = scan.nextLine();
        System.out.println("请输入年龄:");
        int age = scan.nextInt();

        System.out.println(name + "," + pwd + "," + nick + "," + age);

        RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
        //将指针移动到最后
        raf.seek(raf.length());
        //将用户名转为字节数组
        byte[] arrName = name.getBytes(StandardCharsets.UTF_8);
        arrName = Arrays.copyOf(arrName, 32);
        raf.write(arrName);
        System.out.println(raf.getFilePointer());

        byte[] arrPwd = pwd.getBytes(StandardCharsets.UTF_8);
        arrPwd = Arrays.copyOf(arrPwd, 32);
        raf.write(arrPwd);
        System.out.println(raf.getFilePointer());//64

        byte[] arrNick = nick.getBytes(StandardCharsets.UTF_8);
        arrNick = Arrays.copyOf(arrNick, 32);
        raf.write(arrNick);
        System.out.println(raf.getFilePointer());//96

        raf.writeInt(age);
        System.out.println(raf.getFilePointer());//100


        raf.close();
    }
}
