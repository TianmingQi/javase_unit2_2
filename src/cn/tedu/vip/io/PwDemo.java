package cn.tedu.vip.io;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * �����ַ���
 * java.io.BufferedWrite
 * java.io.BufferedReader
 * ʹ�û�����ļ������ݽ��п��д,��߶�дЧ��
 *
 * java.io.PrintWrite
 * ��BufferedWrite�����ϵ���һ�μӹ�
 * �������Զ�ˢ�»��еĹ���
 *
 * @author Tedu
 */
public class PwDemo {
    public static void main(String[] args) throws IOException {
        //PrintWriter �����ֱ��ִ���ļ�,ָ���ַ���
        PrintWriter pw= new PrintWriter("pwd.txt","utf-8");

        pw.println("���������������");
        pw.println("���ò��ù�һ��");
        System.out.println("over");

        pw.close();
    }
}
