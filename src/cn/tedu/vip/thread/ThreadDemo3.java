package cn.tedu.vip.thread;
/**
 * 创建线程的方式3(使用匿名内部类)
 * @author qitianming
 *
 */
public class ThreadDemo3 {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(i+"齐天明");
				}
			}
		};
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(i+"高诗涵");
				}
				
			}
		};
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();

	}

}
