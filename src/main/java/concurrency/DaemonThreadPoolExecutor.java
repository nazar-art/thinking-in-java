package concurrency;

import java.util.concurrent.*;
import net.mindview.util.DaemonThreadFactory;

public class DaemonThreadPoolExecutor extends ThreadPoolExecutor {
	
	public DaemonThreadPoolExecutor() {
		super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS,
				new SynchronousQueue<Runnable>(), new DaemonThreadFactory());
	}
}
