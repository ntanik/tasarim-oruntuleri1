/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Memento_pattern;

//Tamamýnýn veya bazý özelliklerinin kopyasýnýn tutulacaðý nesnedir.
//Bankahesabi_Orginator Bankahesabi_Memento nesnesini oluþturan ve geri yüklenmesinden sorumludur.
public class Bankahesabi_Orginator {
	private String account_State;

	public void setState(String state){
		this.account_State=state;
	}
	public String getState(){
		return account_State;
	}
	public Bankahesabi_Memento saveStateToMemento(){
		return new Bankahesabi_Memento(account_State);
	}
	public void getStateFromMemento(Bankahesabi_Memento memento){
		account_State = memento.getState();
	}

}