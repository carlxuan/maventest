package carlxuan.unsafe;

import carlxuan.share.object.UnsafeUtility;
import sun.misc.Unsafe;

public class ClassInitialization {

	private String password = "123456789";
	
	public ClassInitialization() {
		System.out.println("Very complicated constructor started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Very complicated constructor ended");
	}
	
	public static void main(String[] args) {
		Unsafe unsafe = UnsafeUtility.getUnsafe();
		try {
			ClassInitialization instance = (ClassInitialization) unsafe.allocateInstance(ClassInitialization.class);
			System.out.println(instance.password);
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
		
		
	}

}
