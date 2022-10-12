package cn.tedu.vip.raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class UpdateDemo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = scan.nextLine();
        System.out.println("请输入新昵称:");
        String nick = scan.nextLine();

        RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
        boolean isUpdated = false;//表示是否修改的变量,默认没修改
        for (int i = 0; i < raf.length() / 100; i++) {
            //移动指针至本次循环对应用户的起始位置
            raf.seek(i * 100);
            //读取用户名
            byte[] data = new byte[32];
            raf.read(data);
            String n = new String(data, StandardCharsets.UTF_8).trim();
            //对比当前取出的用户名和用户要修改的用户名是否相同
            if (n.equals(name)) {
                //移动到昵称位置
                raf.seek(i * 100 + 64);
                data = nick.getBytes(StandardCharsets.UTF_8);
                data = Arrays.copyOf(data, 32);
                raf.write(data);
                isUpdated = true;
                System.out.println("修改成功");
                break;
            }
        }//for循环结束
        //判断是否修改过
        if (!isUpdated) {
            System.out.println("查无此人");
        }
        raf.close();
    }
}
