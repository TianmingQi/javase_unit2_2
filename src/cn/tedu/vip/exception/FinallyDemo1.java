package cn.tedu.vip.exception;

/**
 * ֻҪ������try������
 * ��ô�ͻ�ִ��finally��
 * �����Ƿ����쳣,�����쳣�Ƿ񱻲���,��������finally
 * <p>
 * �������ͷ�������IO����ʱ����Դ
 */
public class FinallyDemo1 {
    public static void main(String[] args) {
        System.out.println("����ʼ��");

        try {
            String str = "abc";
            System.out.println(str.length());
            return;
            //���ǵ���System.exit(0),����ִ��try��һ����ִ��finally��
            //������return�ؼ���Ҳ������ֹ
        } catch (Exception e) {
            System.out.println("������!");
        } finally {
            System.out.println("finallyִ����");
        }


        System.out.println("���������");
    }
}
