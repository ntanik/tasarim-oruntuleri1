/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectPoolPettern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

// Reference> https://www.javatpoint.com/object-pool-pattern

public class OturumObjectPoolDemo{
    
      private OturumObjectPool<ExportingProcess> pool;
      private AtomicLong processNo=new AtomicLong(0);
      public void setUp() {
    	  // Create a pool of objects of type ExportingProcess.
          /*Parameters:
            1) Minimum number of special ExportingProcess instances residing in the pool = 4
            2) Maximum number of special ExportingProcess instances residing in the pool = 10
            3) Time in seconds for periodical checking of minObjects / maxObjects conditions
               in a separate thread = 5.
               */
  		  System.out.println("### Object Pool Design Pattern's Example is Runing ###\n");

    	  pool = new OturumObjectPool<ExportingProcess>(6, 10, 5)
          {
              protected ExportingProcess createObject()
              {
                  // create a test object which takes some time for creation
                  return new ExportingProcess( processNo.incrementAndGet());
              }
          };
      }
      public void tearDown() {
          pool.shutdown();
      }
      public void testObjectPool() {
          ExecutorService executor = Executors.newFixedThreadPool(8);

          // execute 8 tasks in separate threads

          executor.execute(new ExportingTask(pool, 1));
          executor.execute(new ExportingTask(pool, 2));
          executor.execute(new ExportingTask(pool, 3));
          executor.execute(new ExportingTask(pool, 4));
          executor.execute(new ExportingTask(pool, 5));
          executor.execute(new ExportingTask(pool, 6));
          executor.execute(new ExportingTask(pool, 7));
          executor.execute(new ExportingTask(pool, 8));

          executor.shutdown();

          try {
              executor.awaitTermination(30, TimeUnit.SECONDS);
              } catch (InterruptedException e)

                {
                 e.printStackTrace();
                }
      }
      public static void main(String args[])  {
          OturumObjectPoolDemo op=new OturumObjectPoolDemo();
          op.setUp();
          op.tearDown();
          op.testObjectPool();
     }
  }//End of the ObjectPoolDemo class.