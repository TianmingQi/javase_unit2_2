package cn.tedu.vip.exception;

public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("����ʼ");
        try {
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        } catch (Exception e) {
            /*
            ����쳣�Ķ�ջ��Ϣ
             */
//            e.printStackTrace();
            System.err.println(e.getMessage());//err���Ϊ��ɫ
            System.out.println(e.getMessage());

            System.out.println("������");
        }

        System.out.println("�������");
    }
}
