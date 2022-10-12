package cn.tedu.vip.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
        /*
        创建文件流方法:
        FileOutputStream(File file)
        FileOutputStream(String path)
        //上面两种创建形式都是覆盖输出模式
        如果当前文件中有内容会全部清除重新写

        FileOutputStream(File file,true)
        FileOutputStream(String path,true)
        追加模式
        在源文件所有内容的最后再追加输出的内容
        不会清除原文件的内容
         */
        FileOutputStream fos = new FileOutputStream("fos.txt",true);
        String str = "流太厉害了,奥利给!";
        //String str = "文件输出流,奥利给!";
        byte[] data = str.getBytes("gbk");

        fos.write(data);
        System.out.println("over");
        fos.close();

    }
}
