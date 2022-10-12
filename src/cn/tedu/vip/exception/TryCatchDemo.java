package cn.tedu.vip.exception;

/**
 * try-catch的使用
 * Exception类是所有异常类的父类
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始");

        try {
            /*
            try块中发生异常会匹配catch块中指定的异常类型
            如果匹配,进入catch运行

            try块中的代码一旦发生异常,就不会执行try块中剩余的语句了
             */
            String str = "abc";
            System.out.println(str.length());
            System.out.println(str.charAt(1));
            System.out.println(Integer.parseInt(str));
        } catch (NullPointerException e) {
            System.out.println("发生了空指针异常");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("发生了字符串索引越界异常");
        } catch (Exception e) {
            System.out.println("反正是出错了");
        }

        System.out.println("程序结束");
    }
}
