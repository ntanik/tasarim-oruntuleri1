/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mediator_Pattern;
public abstract class BankaSubesi {
	protected MerkeziBankaMediator mediator;
	protected String subeIsmi;

	public BankaSubesi(MerkeziBankaMediator mediator, String subeIsmi){
		this.mediator = mediator;
		this.subeIsmi = subeIsmi;
	}

	public abstract void sendMesaj(String mesaj);

	public abstract void receiveMesaj(String mesaj);
}
