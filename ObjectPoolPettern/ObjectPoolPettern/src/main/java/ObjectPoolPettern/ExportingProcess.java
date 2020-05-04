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
public class ExportingProcess {
    
private long processNo;

	public ExportingProcess(long processNo){
		this.processNo=processNo;

		/// It is for do expensive calls or tasks

		System.out.println(processNo+". Oturum Objesi Ayarlandý (created)");
	}

	public long getProcessNo(){
		return processNo;
	}
}
