package cn.tedu.vip.exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class AutoClosedDemo {
    public static void main(String[] args) {
        try (
                /*
                必须是实现了Autocloseable接口的类才能自动调用close

                本质上是编译器在编译代码时,将try()里的资源进行自动的
                编码关闭,并在finally的位置执行
                 */
                FileOutputStream fos = new FileOutputStream("e:/aaa/abc.txt");
                OutputStreamWriter osw = new OutputStreamWriter(fos);
        ) {
            osw.write(1);
        } catch (IOException e) {
            System.out.println("出错了");
        }

        System.out.println("程序结束");
    }
}
