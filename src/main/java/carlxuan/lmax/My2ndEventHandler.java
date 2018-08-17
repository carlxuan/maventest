package carlxuan.lmax;

import com.lmax.disruptor.EventHandler;

public class My2ndEventHandler implements EventHandler<Task>{

	@Override
	public void onEvent(Task event, long sequence, boolean endOfBatch) throws Exception {
		System.out.println("In Handler2");
	}
	
}
