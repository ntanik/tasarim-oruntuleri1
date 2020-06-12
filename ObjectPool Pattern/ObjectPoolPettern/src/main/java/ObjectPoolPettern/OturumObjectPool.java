/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectPoolPettern;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
//Reference > https://www.javatpoint.com/object-pool-pattern

public abstract class OturumObjectPool <T>{

	private ConcurrentLinkedQueue<T> pool;

	private ScheduledExecutorService executorService;

	// Constructor to create the pool
	public OturumObjectPool(final int minObjects){
		// initialize pool
		initialize(minObjects);
	}
	// another constructor \ third param: time in seconds for periodical checking
	public OturumObjectPool(final int minObjects,final int maxObjects,final long validationInterval){
		// initialize the pool
		initialize(minObjects);
		// condition in separate thread
		executorService = Executors.newSingleThreadScheduledExecutor();
		executorService.scheduleWithFixedDelay(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int size = pool.size();
				if(size<minObjects){
					int sizeToBeAdded = minObjects + size;
					for(int i=0;i<sizeToBeAdded;i++){
						pool.poll();
					}
				}
			}

		}, validationInterval, validationInterval, TimeUnit.SECONDS);
	}


public T borrowObject(){
	T object;
	if((object=pool.poll())==null){
		object=createObject();
	}
	return object;
}

public void returnObject(T object){
	if(object==null){
		return;
	}
	this.pool.offer(object);
}

public void shutdown(){
    if (executorService != null){
        executorService.shutdown();
    }
}


protected abstract T createObject();

private void initialize(final int minObjects)  {
    pool = new ConcurrentLinkedQueue<T>();
    for (int i = 0; i < minObjects; i++) {
        pool.add(createObject());
    }
}
}
