package carlxuan.lmax;

public class Test {

	public static void main(String[] args) {
		CleanroomKernel k = new CleanroomKernel();
		k.start();
		k.process();
		k.process();
		k.process();
		k.process();
		k.process();
	}
}
