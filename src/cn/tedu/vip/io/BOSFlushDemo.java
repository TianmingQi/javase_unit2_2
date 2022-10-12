package cn.tedu.vip.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流写出数据缓冲区
 */
public class BOSFlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String str = "右边~划一道彩虹!";
        byte[] data = str.getBytes("GBK");
        bos.write(data);

        /*
        强制将当前缓冲区中的字节一次性取出
        同时清空缓冲区,是即时的写出
        实际上也会增加写出的次数,降低写出效率
         */
        //bos.flush();
        System.out.println("over");

        //bos.close()内部也会调用flush()方法
        bos.close();
        //打汉语当然快了,打英语就很慢，当然
        //这一切都是可以通过练习提高的
        //比如以前我的打字速度是每分钟30个字
        //就现在而言,我虽然没有数过,但可以确定的是,肯定比之前要快的多
        //这就与我经常学习编程,经常打字有着非常紧密的关联,所以找一份,需要打字的
        //工作对于想要提高打字速度的你来说,是非常具有帮助的

    }
}
