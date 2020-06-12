/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iterator_Pattern_Example;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class YoneticiContainer implements Container{

    Hashtable<Integer, Yonetici> yoneticiList = new Hashtable<Integer, Yonetici>();
    int hashKey = 0;

	public YoneticiContainer(){
		addYonetici("Ahmet","Akbulut",45);
		addYonetici("Unal","Sayar",50);
		addYonetici("Merve","Ateþ",37);


	}
	public void addYonetici(String isim,String soyisim,int age){
		Yonetici yoneticiBilgisi=new Yonetici(isim,soyisim,age);
		yoneticiList.put(hashKey, yoneticiBilgisi);
		hashKey++;
	}

	public Iterator createIterator() {
		YoneticiIterator result = new YoneticiIterator(yoneticiList);
		return result;
	}
}
