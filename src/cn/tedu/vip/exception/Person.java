package cn.tedu.vip.exception;

/**
 * 模拟一个实体类,当前业务中只考虑age属性,和异常的情况
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
            /*根据业务需求,可以在age值不符合要求时
            主动抛出异常,表示程序中这样的赋值不被允许
            throw 关键字 后面实例化一个异常对象,当前代码会发生这个类型的异常
            当前方法会在运行throw后终止,功能类似return
             */
            throw new IllegalAgeException("年龄不合法");
        }
        this.age = age;
    }
}
