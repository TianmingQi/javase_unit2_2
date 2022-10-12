package cn.tedu.vip.exception;

/**
 * try-catch��ʹ��
 * Exception���������쳣��ĸ���
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("����ʼ");

        try {
            /*
            try���з����쳣��ƥ��catch����ָ�����쳣����
            ���ƥ��,����catch����

            try���еĴ���һ�������쳣,�Ͳ���ִ��try����ʣ��������
             */
            String str = "abc";
            System.out.println(str.length());
            System.out.println(str.charAt(1));
            System.out.println(Integer.parseInt(str));
        } catch (NullPointerException e) {
            System.out.println("�����˿�ָ���쳣");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("�������ַ�������Խ���쳣");
        } catch (Exception e) {
            System.out.println("�����ǳ�����");
        }

        System.out.println("�������");
    }
}
