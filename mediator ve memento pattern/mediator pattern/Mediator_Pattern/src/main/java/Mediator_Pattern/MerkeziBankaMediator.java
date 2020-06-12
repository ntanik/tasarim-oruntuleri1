/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mediator_Pattern;

public interface MerkeziBankaMediator {

	public void sendBilgilendirmeMesaj(String mesaj, BankaSubesi sube);
	void addSube(BankaSubesi sube);
}

