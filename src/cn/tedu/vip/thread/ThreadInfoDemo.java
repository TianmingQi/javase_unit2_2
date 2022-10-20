package cn.tedu.vip.thread;
/**
 * 了解线程信息相关API
 * @author qitianming
 *
 */
public class ThreadInfoDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		//线程名称
		String name = t.getName();
		System.out.println("线程名称:"+name);
		
		long id = t.getId();
		System.out.println("线程唯一标识:"+id);
		
		boolean isAlive = t.isAlive();
		System.out.println("是否活着:"+isAlive);
		
		boolean isDaemon = t.isDaemon();
		System.out.println("是否是守护线程:"+isDaemon);
		
		boolean isInterrupted = t.isInterrupted();
		System.out.println("是否中断:"+isInterrupted);
		
		int priority = t.getPriority();
		System.out.println("优先级:"+priority);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
