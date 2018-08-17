package carlxuan.share.object;

public class ComplicateClass {
	private String job;
	public ComplicateClass(String job) {
		System.out.println("Entered into constructor");
		this.job = job;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Entered into constructor");
	}
	
	public void doSomething() {
		System.out.println("Job name: "+job);
	}
}
