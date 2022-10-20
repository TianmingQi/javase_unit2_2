package cn.tedu.vip.thread;

/**
 * 创建线程的方式2
 * 
 * @author qitianming
 *
 */
public class ThreadDemo2 {

	public static void main(String[] args) {
		MyRunnable1 r1 = new MyRunnable1();
		MyRunnable2 r2 = new MyRunnable2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

	}

}

class MyRunnable1 implements Runnable {
	/*
	 * 必须重写接口中声明的run方法
	 */
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + "就爱和你玩");
		}

	}

}

class MyRunnable2 implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + "气死本大爷了");
		}

	}
}