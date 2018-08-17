package carlxuan.lmax;

import com.lmax.disruptor.EventHandler;

public class MyEventHandler implements EventHandler<Task>{

	@Override
	public void onEvent(Task event, long sequence, boolean endOfBatch) throws Exception {
		Thread.sleep(1000);
		System.out.println("Start to process task "+this);
		event.process();
		System.out.println("End of process "+this);
	}
	
}
