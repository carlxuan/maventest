package carlxuan.multithread;

public class DeadLock {

	public static void main(String[] args) {
		DeadLock thread = new DeadLock();
		Read r = new Read(thread);
		Write w = new Write(thread);
		new Thread(r, "Read123").start();
		new Thread(w, "Write123").start();
	}
	
	static class Read implements Runnable{
		DeadLock d;
		public Read(DeadLock d) {
			this.d = d;
		}
		@Override
		public void run() {
			d.read();
		}
	}
	
	static class Write implements Runnable{
		DeadLock d;
		public Write(DeadLock d) {
			this.d = d;
		}
		@Override
		public void run() {
			d.write();
		}
	}
	
	Object lock1 = new Object() {
		@Override
		public String toString() {
			return "lock11111111";
		}
	};
	Object lock2 = new Object(){
		@Override
		public String toString() {
			return "lock22222222";
		}
	};
	public void read() {
		System.out.println(Thread.currentThread().getName()+" Enetered read");
		synchronized(lock1) {
			System.out.println(Thread.currentThread().getName()+" Get lock1");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(lock2) {
				System.out.println(Thread.currentThread().getName()+" Get lock2");
			}
		}
	}
	
	public void write() {
		System.out.println(Thread.currentThread().getName()+" Enetered write");
		synchronized(lock2) {
			System.out.println(Thread.currentThread().getName()+" Get lock2");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(lock1) {
				System.out.println(Thread.currentThread().getName()+" Get lock1");
			}
		}
	}
	

}
