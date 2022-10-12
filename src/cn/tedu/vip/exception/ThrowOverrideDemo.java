package cn.tedu.vip.exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 子类重写父类含有异常声明的方法时子类方法的重写规则
 */
public class ThrowOverrideDemo {
    public void dosome()throws IOException, AWTException {

    }
}
class Sub extends ThrowOverrideDemo{
    //子类重写父类方法并抛出全部异常 YES!!!
//    public void dosome()throws IOException,AWTException{
//
//    }

    //抛出其中一个 YES!!!
//    public void dosome()throws IOException{
//
//    }

    //一个都不抛出 YES!!!
//    public void dosome(){
//
//    }

    //抛出父类声明异常类型的子类 YES!!!
//    public void dosome()throws FileNotFoundException {
//
//    }

    //抛出父类没有声明的其他异常 NO!!!
//    public void dosome()throws SQLException {
//
//    }

    //抛出父类声明异常类型的父类 NO!!!
//    public void dosome()throws Exception{
//
//    }
}