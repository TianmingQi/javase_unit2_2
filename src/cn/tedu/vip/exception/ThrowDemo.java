package cn.tedu.vip.exception;

/**
 * 使用Person类演示自定义异常类的使用,抛出,处理
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

        System.out.println("年龄是:"+p.getAge());
    }
}
