package cn.tedu.vip.io;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {
    /*
    serialVersionUID��ʾ��ǰPerson��汾��
    ���л�ʱ�Ὣ����汾��ϢҲд�뵽Ӳ��
    �����л�ʱ��ԱȰ汾����ֵ�Ƿ���ͬ,��ͬ��ת,����ͬ����ת
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String gender;
    private transient String[] hobby;

    public Person(String name, int age, String gender, String[] hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
