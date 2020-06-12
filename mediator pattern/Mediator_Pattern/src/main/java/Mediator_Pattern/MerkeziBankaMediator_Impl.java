/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mediator_Pattern;

import java.util.ArrayList;
import java.util.List;

public class MerkeziBankaMediator_Impl implements MerkeziBankaMediator{

	private List<BankaSubesi> subeList;

	public MerkeziBankaMediator_Impl(){
		this.subeList = new ArrayList<>();
	}
	@Override
	public void sendBilgilendirmeMesaj(String mesaj, BankaSubesi sube) {

		for (BankaSubesi s : this.subeList){
			if (s != sube){
				s.receiveMesaj(mesaj);
			}
		}

	}

	@Override
	public void addSube(BankaSubesi sube) {
		this.subeList.add(sube);
	}

}
