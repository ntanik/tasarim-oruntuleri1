/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer_Pattern;

public class MainProgram {

	public static void main(String[] args) {

		System.out.println("### Observer Design Pattern's Example is Runing ###\n");

		// Create subjects
		KampanyaMesaj_Subscriber kampanyaMsg=new KampanyaMesaj_Subscriber();

		// Create observers
		Observer observer_1 = new BankaKullanici("Aykut Demir");
		Observer observer_2 = new BankaKullanici("Alp Erdo�an");
        Observer observer_3 = new BankaKullanici("Merve Do�anAy");

        // add observer to topic
        kampanyaMsg.addObserver(observer_1);
        kampanyaMsg.addObserver(observer_2);
        kampanyaMsg.addObserver(observer_3);

        // Connect observer to subject
        observer_1.setSubject(kampanyaMsg);
        observer_2.setSubject(kampanyaMsg);
        observer_3.setSubject(kampanyaMsg);

        observer_1.update();
        observer_3.update();

        Kampanya kampanya = new Kampanya("�lk Kampanyam�z","Kampanyamiz Altin dovizi alimi ile ilgilidir","1 ayd�r");
        // Send Kampanya bilgileri
        kampanyaMsg.postMessage(kampanya);
        System.out.println("---------------------------------------------------\n");
        kampanyaMsg.removeObserver(observer_2);
        Kampanya kampanya_2 = new Kampanya("2. Kampanyam�z","�ocuklar�n gelece�i i�in kumbara kampanyas�na kat�l�n","2 ayd�r");
        kampanyaMsg.postMessage(kampanya_2);
        System.out.println("---------------------------------------------------\n");

	}

}