package cn.tedu.vip.raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 优化文件复制
 * 创建缓存,减少读写数据的次数
 * 单字节读写是一种随机读写形式
 * 一组字节读写是块读写形式
 *
 * @author Tedu
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rafRead = new RandomAccessFile("./最伟大的作品.m4a", "r");
        RandomAccessFile rafWrite = new RandomAccessFile("./最伟大的作品_cp.m4a", "rw");
        RandomAccessFile rafWrite2 = new RandomAccessFile("./最伟大的作品_cp2.m4a", "rw");

        //定义缓存
        byte[] data = new byte[1024 * 10];//定义一个10K的缓存
        int len;
        long start = System.currentTimeMillis();
        while ((len = rafRead.read(data)) != -1) {
            rafWrite.write(data, 0, len);
            rafWrite2.write(data, 0, len);
        }
        long end = System.currentTimeMillis();
        System.out.println("用时:" + (end - start) + "ms");
        rafRead.close();
        rafWrite.close();
    }
}
