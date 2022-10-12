package cn.tedu.vip.raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 简易记事本
 * 程序启动后用户输入一个文件名
 * 针对这个文件进行读写操作
 * 使用循环让用户向记事本中写入字符串
 * 统一编码utf-8,不用考虑换行问题
 * 输入exit结束循环
 * @author Tedu
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要创建的文件名:");
        String fileName = scanner.nextLine();
        RandomAccessFile raf = new RandomAccessFile(fileName,"rw");
        //循环开始记事
        while(true){
            System.out.println("请输入记事:");
            String msg = scanner.nextLine();
            if (msg.equals("exit")) {
                break;
            }
            byte[] data = msg.getBytes();
            raf.write(data);
        }
        System.out.println("程序结束");

        raf.close();
    }
}
