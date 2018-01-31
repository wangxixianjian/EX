package ex;

public class thread3 implements Runnable{
	public void run() {
		for(int i = 0; i <= 100;i++) {
			try{
				Thread.currentThread().sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("c" + i);
		}
	}
}
