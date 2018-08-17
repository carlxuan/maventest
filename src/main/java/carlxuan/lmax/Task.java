package carlxuan.lmax;

public class Task {
	static volatile int i = 0;
	public String process() {
		System.out.println("Processing task........"+i++);
		return "You are right, Carl";
	}
}
