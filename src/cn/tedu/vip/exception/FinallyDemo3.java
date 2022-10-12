package cn.tedu.vip.exception;

/**
 * �쳣�ṹ�ۺ�ϰ��
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
            System.out.println("������test:" + string);
            return string.charAt(0);
        } catch (NullPointerException e) {
            System.out.println("�����˿�ָ���쳣");
            return 1;
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("�������ַ����±�Խ���쳣");
            return 2;
        } catch (Exception e) {
            System.out.println("������δ֪����!");
            return 3;
        } finally {
            System.out.println("finally��ִ��");
        }
    }

}
