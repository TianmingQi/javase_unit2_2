package cn.tedu.vip.exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO程序结合异常机制的编写
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("e:/abc/aaa.txt");
            fos.write(1);
        } catch (IOException e) {
            System.out.println("出错了");
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("关闭出现异常");
            }
        }


        System.out.println("程序结束");
    }
}
