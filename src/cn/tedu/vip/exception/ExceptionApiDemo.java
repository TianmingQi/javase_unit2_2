package cn.tedu.vip.exception;

public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try {
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        } catch (Exception e) {
            /*
            输出异常的堆栈信息
             */
//            e.printStackTrace();
            System.err.println(e.getMessage());//err输出为红色
            System.out.println(e.getMessage());

            System.out.println("出错了");
        }

        System.out.println("程序结束");
    }
}
