/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iterator_Pattern_Example;

import java.util.ArrayList;
import java.util.List;

public class MusteriContainer implements Container{

	private List<Musteri> musteriList = new ArrayList<Musteri>();
	public MusteriContainer(){
		addMusteri("Nimet","Tanýk",24);
		addMusteri("Caner","Bulut",30);
		addMusteri("Esma","Bodur",27);


	}
	public void addMusteri(String isim,String soyisim,int age){
		Musteri musteriBilgisi=new Musteri(isim,soyisim,age);
		musteriList.add(musteriBilgisi);
	}

	public Iterator createIterator() {
		MusteriIterator result = new MusteriIterator(musteriList);
		return result;
	}

}