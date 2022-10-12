package cn.tedu.vip.exception;

/**
 * 异常结构综合习题
 *
 * @author Qi
 */
public class FinallyDemo3 {
    public static void main(String[] args) {
        System.out.println(test("") + "," + test(null) + "," + test("a"));
        System.out.println("over");
    }

    public static int test(String string) {
        try {
            System.out.println("调用了test:" + string);
            return string.charAt(0);
        } catch (NullPointerException e) {
            System.out.println("出现了空指针异常");
            return 1;
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("出现了字符串下标越界异常");
            return 2;
        } catch (Exception e) {
            System.out.println("出现了未知错误!");
            return 3;
        } finally {
            System.out.println("finally被执行");
        }
    }

}
