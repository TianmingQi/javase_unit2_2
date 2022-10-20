package cn.tedu.vip.thread;
/**
 * 创建线程的方式1
 * @author qitianming
 *
 */
public class ThreadDemo1 {

	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		t1.start();
		t2.start();

	}

}

class MyThread1 extends Thread {
	/*
	 * 要想开启一个新的线程,必须在继承Thread类之后 重写父类中的run()方法
	 */
	public void run() {
		/*
		 * run方法中的代码就是开启新线程要执行的任务序列
		 */
		for (int i = 0; i < 1000; i++) {
			System.out.println(i+"你是谁");
		}
	}

}

class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i+"我是收电费的");
		}
	}
}