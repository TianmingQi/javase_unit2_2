package cn.tedu.vip.io;

import java.io.*;

public class pwDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("pw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw);

        pw.println("��ô20���굽ͷ��");
        pw.println("�����˺��︡��");

        System.out.println("over");

        pw.close();
    }
}
