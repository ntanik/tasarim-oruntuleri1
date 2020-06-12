/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Memento_pattern;

/// Bankahesabi_Memento Bankahesabi_Originator nesnesinin
/// saklanacak özelliklerinin tanýmlý olduðu nesne.

public class Bankahesabi_Memento {
	/// Burada banka hesabin durumu kaydedeilecektir ..
	private String account_State;

	public Bankahesabi_Memento(String account_State){
		this.account_State = account_State;
	}
	public String getState(){
		return account_State;
	}

}