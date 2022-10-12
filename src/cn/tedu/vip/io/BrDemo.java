package cn.tedu.vip.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * »º³å×Ö·ûÊäÈëÁ÷
 */
public class BrDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String msg = null;
        while ((msg = br.readLine()) != null) {
            System.out.println(msg);
        }

        System.out.println("over");
        br.close();
    }
}
