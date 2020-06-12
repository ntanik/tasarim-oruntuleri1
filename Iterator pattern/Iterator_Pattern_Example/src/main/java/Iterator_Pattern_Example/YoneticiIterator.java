/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iterator_Pattern_Example;

import java.util.Hashtable;

public class YoneticiIterator implements Iterator{

	private static int hashkey=0;
	private  Hashtable<Integer, Yonetici> iteratyoneticiList;
	public YoneticiIterator(Hashtable<Integer, Yonetici> kullaniciList){
		this.iteratyoneticiList=kullaniciList;
	}
	public boolean hasNext() {
		if (iteratyoneticiList.size()>0)
			return true;
		else
			return false;
	}


	public Object next() {
		if(this.hasNext()){
			Yonetici yonetici = iteratyoneticiList.get(hashkey);
			iteratyoneticiList.remove(hashkey);
			hashkey++;
			return yonetici;
		}else
			return null;
	}
}
