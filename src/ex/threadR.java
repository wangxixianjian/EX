package ex;

public class threadR implements Runnable{
	int count = 40;
	Object lock = new Object();
	@SuppressWarnings("static-access")
	public synchronized void shoupiao() {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "售出了" + count + "张票");
			count --;
	}
	public void run() {
		while(count > 0) {
			shoupiao();
		}
	}
}
	