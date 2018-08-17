package carlxuan.lmax;

import java.util.concurrent.Executors;

import com.lmax.disruptor.BlockingWaitStrategy;
import com.lmax.disruptor.WaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

public class CleanroomKernel {
	Disruptor disruptor;
	public CleanroomKernel() {
		disruptor = new Disruptor(
				Task::new,
				2,
				Executors.newFixedThreadPool(2),
				ProducerType.MULTI,
				new BlockingWaitStrategy()
				) ;
		disruptor.handleEventsWith(new MyEventHandler());
//		disruptor.handleEventsWith(new MyEventHandler(), new MyEventHandler()).then(new My2ndEventHandler());

	}
	
	public void start() {
		disruptor.start();
	}
	
	public void process() {
		disruptor.publishEvent((a,b)->new Task());
	}
	
	
	
}
