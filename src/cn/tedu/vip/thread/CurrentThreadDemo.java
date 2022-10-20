package cn.tedu.vip.thread;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		/*
		 * main方法实际上也是一条线程,只是不由程序员创建
		 */
		Thread m = Thread.currentThread();
		System.out.println(m);
		
		Thread t = new Thread() {
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				Thread t = Thread.currentThread();
				System.out.println(t);
				dosome();
			}
		};
		t.setName("Qi");
		t.start();
	}
	
	public static void dosome() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}

}
