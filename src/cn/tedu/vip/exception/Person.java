package cn.tedu.vip.exception;

/**
 * ģ��һ��ʵ����,��ǰҵ����ֻ����age����,���쳣�����
 */
public class Person {
    private String name;
    private int age;
    //...

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if (age<0||age>120) {
            /*����ҵ������,������ageֵ������Ҫ��ʱ
            �����׳��쳣,��ʾ�����������ĸ�ֵ��������
            throw �ؼ��� ����ʵ����һ���쳣����,��ǰ����ᷢ��������͵��쳣
            ��ǰ������������throw����ֹ,��������return
             */
            throw new IllegalAgeException("���䲻�Ϸ�");
        }
        this.age = age;
    }
}
