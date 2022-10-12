package cn.tedu.vip.exception;

/**
 * 只要进入了try块运行
 * 那么就会执行finally块
 * 无论是否发生异常,无论异常是否被捕获,都会运行finally
 * <p>
 * 常用于释放类似于IO操作时的资源
 */
public class FinallyDemo1 {
    public static void main(String[] args) {
        System.out.println("程序开始了");

        try {
            String str = "abc";
            System.out.println(str.length());
            return;
            //除非调用System.exit(0),否则执行try块一定会执行finally块
            //哪怕是return关键字也不能阻止
        } catch (Exception e) {
            System.out.println("出错了!");
        } finally {
            System.out.println("finally执行了");
        }


        System.out.println("程序结束了");
    }
}
