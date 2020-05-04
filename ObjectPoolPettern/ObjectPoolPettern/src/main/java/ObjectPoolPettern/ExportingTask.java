/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectPoolPettern;

/**
 *
 * @author User
 */
public class ExportingTask implements Runnable{

	private OturumObjectPool<ExportingProcess> pool;
	private int threadNo;

	public ExportingTask(OturumObjectPool<ExportingProcess> pool, int threadNo){
		this.pool=pool;
		this.threadNo=threadNo;
	}

	@Override
	public void run() {

		ExportingProcess exportingProcess = pool.borrowObject();

		System.out.println("Thread "+threadNo+"==> "+exportingProcess.getProcessNo()
		+". Kullanýcýnýn Sistemde Oturumu Saðlandý(Açýldý)");


		pool.returnObject(exportingProcess);

		System.out.println("Thread "+threadNo+"==> "+exportingProcess.getProcessNo()
		+". Kullanýcýnýn Sistemde Oturumu Kapatýldý(Exite)");

	}
}