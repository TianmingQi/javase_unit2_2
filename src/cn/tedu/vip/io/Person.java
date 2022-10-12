package cn.tedu.vip.io;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {
    /*
    serialVersionUID表示当前Person类版本的
    序列化时会将这个版本信息也写入到硬盘
    反序列化时会对比版本的数值是否相同,相同可转,不相同不可转
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
