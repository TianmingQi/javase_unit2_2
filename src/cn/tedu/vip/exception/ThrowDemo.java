package cn.tedu.vip.exception;

/**
 * ʹ��Person����ʾ�Զ����쳣���ʹ��,�׳�,����
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();

        try {
            p.setAge(200);
        } catch (IllegalAgeException e) {
//            e.printStackTrace();
            System.err.println(e.getMessage());
        }

        System.out.println("������:"+p.getAge());
    }
}
