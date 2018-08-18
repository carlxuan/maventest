package carlxuan.multithread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {

	public static void main(String[] args) {
		read1();
		read2();
		write1();
		write2();
	}
	
	static ReadWriteLock lock = new ReentrantReadWriteLock();
	private static void read1() {
		Thread t1 = new Thread("Read1") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" enter read1 method");
				lock.readLock().lock();
				System.out.println(Thread.currentThread().getName()+" obtained read1 lock");
				lock.readLock().unlock();
				System.out.println(Thread.currentThread().getName()+" released read1 lock");
			}
		};
		t1.start();
	}

	private static void read2() {
		Thread t1 = new Thread("Read2") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" enter read2 method");
				lock.readLock().lock();
				System.out.println(Thread.currentThread().getName()+" obtained read2 lock");
				lock.readLock().unlock();
				System.out.println(Thread.currentThread().getName()+" released read2 lock");
			}
		};
		t1.start();
	}
	
	private static void write1() {
		Thread t1 = new Thread("Write1") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" enter Write1 method");
				lock.writeLock().lock();
				System.out.println(Thread.currentThread().getName()+" obtained Write1 lock");
				lock.writeLock().unlock();
				System.out.println(Thread.currentThread().getName()+" released Write1 lock");
			}
		};
		t1.start();
	}
	
	private static void write2() {
		Thread t1 = new Thread("Write2") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" enter Write2 method");
				lock.writeLock().lock();
				System.out.println(Thread.currentThread().getName()+" obtained Write2 lock");
				lock.writeLock().unlock();
				System.out.println(Thread.currentThread().getName()+" released Write2 lock");
			}
		};
		t1.start();
	}
}
