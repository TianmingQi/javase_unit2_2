package cn.tedu.vip.io;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 缓冲字符流
 * java.io.BufferedWrite
 * java.io.BufferedReader
 * 使用缓存对文件的内容进行块读写,提高读写效率
 *
 * java.io.PrintWrite
 * 是BufferedWrite基础上的有一次加工
 * 具有了自动刷新换行的功能
 *
 * @author Tedu
 */
public class PwDemo {
    public static void main(String[] args) throws IOException {
        //PrintWriter 类可以直接执行文件,指定字符集
        PrintWriter pw= new PrintWriter("pwd.txt","utf-8");

        pw.println("像我这样优秀的人");
        pw.println("本该灿烂过一生");
        System.out.println("over");

        pw.close();
    }
}
