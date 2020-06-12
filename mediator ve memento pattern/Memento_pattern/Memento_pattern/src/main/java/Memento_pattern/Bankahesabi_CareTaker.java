/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Memento_pattern;

import java.util.ArrayList;
import java.util.List;

//Saklanacak olan memento nesnesinin referansýný içinde barýndýran nesnedir.

public class Bankahesabi_CareTaker {

	private List<Bankahesabi_Memento> mementoList = new ArrayList<Bankahesabi_Memento>();

	public void add(Bankahesabi_Memento m){
		mementoList.add(m);
	}
	public Bankahesabi_Memento get(int index){
		return mementoList.get(index);
	}

}
