/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mediator_Pattern;

public class BankaSubesi_Impl extends BankaSubesi{

	public BankaSubesi_Impl(MerkeziBankaMediator med, String mesaj){
		super(med,mesaj);
	}
	@Override
	public void sendMesaj(String mesaj) {

		System.out.println(this.subeIsmi + " Tarafýndan bu mesaj gönderildi : "+mesaj );
		mediator.sendBilgilendirmeMesaj(mesaj, this);
	}

	@Override
	public void receiveMesaj(String mesaj) {

		System.out.println(this.subeIsmi + " Tarafýndan bu mesaj alýndý : "+mesaj );
	}

}
