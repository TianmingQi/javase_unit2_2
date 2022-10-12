package cn.tedu.vip.io;

import java.io.*;
import java.util.Scanner;

/**
 * 简易记事本
 * 程序启动后,由用户输入记事本的文件名
 * 用户循环向记事本输入内容
 * 输入exit时循环退出,程序结束
 *
 * @author Tedu
 */
public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String fileName = scan.nextLine();

        FileOutputStream fos = new FileOutputStream(fileName, true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        PrintWriter pw = new PrintWriter(bw);

        while (true) {
            System.out.println("请记事");
            String msg = scan.nextLine();
            if ("exit".equals(msg)) {//equals()方法一般把具体变量放在左边,防止空指针异常
                break;
            }
            pw.println(msg);
        }
        System.out.println("over");
        pw.close();

    }
}
