package cn.tedu.vip.exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * ������д���ຬ���쳣�����ķ���ʱ���෽������д����
 */
public class ThrowOverrideDemo {
    public void dosome()throws IOException, AWTException {

    }
}
class Sub extends ThrowOverrideDemo{
    //������д���෽�����׳�ȫ���쳣 YES!!!
//    public void dosome()throws IOException,AWTException{
//
//    }

    //�׳�����һ�� YES!!!
//    public void dosome()throws IOException{
//
//    }

    //һ�������׳� YES!!!
//    public void dosome(){
//
//    }

    //�׳����������쳣���͵����� YES!!!
//    public void dosome()throws FileNotFoundException {
//
//    }

    //�׳�����û�������������쳣 NO!!!
//    public void dosome()throws SQLException {
//
//    }

    //�׳����������쳣���͵ĸ��� NO!!!
//    public void dosome()throws Exception{
//
//    }
}