package carlxuan.optimization;

public class Test {

	public static void main(String[] args) {
		new Test().test1();
		try {
			Thread.sleep(200000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test1() {
		test2();
	}
	
	public void test2() {
		System.out.println("Hellp");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test3();
	}
	
	public void test3() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test5();
	}
	
	public void test5() {
		System.out.println("Hello");
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test6();
		System.out.println("Finished");
	}
	
	public void test6() {
		System.out.println("Hello");
	}

}
