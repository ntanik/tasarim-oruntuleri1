/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class KampanyaMesaj_Subscriber implements Subject {

	//private ArrayList<Kampanya> allKampanya;
	private Kampanya ksample;
	private ArrayList<Observer> observers;
	private final Object MUTEX = new Object();
	private boolean changed;

	public KampanyaMesaj_Subscriber(){
		ksample = new Kampanya();
		this.observers = new ArrayList<> ();
	}
	@Override
	public void addObserver(Observer observer) {
		if (observer == null )
			throw new NullPointerException("Null Obsever You must to Enter full one..");
		synchronized (MUTEX) {
			if (!observers.contains(observer)) observers.add(observer);
		}
	}

	@Override
	public void removeObserver(Observer observer) {

		synchronized (MUTEX)
		{
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		List<Observer> observerLocal = null;

		synchronized (MUTEX) {
			if (!changed)
				return ;
			observerLocal = new ArrayList<>(this.observers);
			this.changed = false;
		}
		for (Observer o : observerLocal){
			o.update();
		}
	}

	@Override
	public Object getUpdate(Observer obj) {

		return this.ksample;
	}

	public void postMessage(Kampanya kampanyaMsg){
		System.out.println("Topic'a gönderilen kampanya mesajýn bilgileri: \n"+"Kampanyanýn Baþlýðý: "+kampanyaMsg.kampanyaBaslik+
				",\nKampanyanýn Ýçeriði: "+kampanyaMsg.kampanyaIcerik+", Kampanyanýn Süresi:"+kampanyaMsg.kampanyaSuresi);
		this.ksample= kampanyaMsg;
		this.changed=true;
		notifyObservers();
	}

}
