package carlxuan.initiaization;

import carlxuan.share.object.ComplicateClass;

public class TestConstructor {

	private static ComplicateClass klass;
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				klass = new ComplicateClass("T1");
			}
		};
		t1.start();
		Thread.sleep(5000);
		klass.doSomething();
	}

}
