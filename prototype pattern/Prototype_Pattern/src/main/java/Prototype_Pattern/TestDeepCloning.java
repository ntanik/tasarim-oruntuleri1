/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototype_Pattern;

/**
 *
 * @author User
 */
public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("### Prototype Design Pattern's Example is Runing ###\n");

		CloneFactory kullaniciMaker = new CloneFactory();

		Musteri orijinalMusteri = new Musteri();
		Musteri clonedMusteri = (Musteri)kullaniciMaker.getDeepClone(orijinalMusteri);

		orijinalMusteri.showUp();
		clonedMusteri.showUp();
		System.out.println();

		System.out.println("orijinal Musterinin Adresi: "+ System.identityHashCode(orijinalMusteri));
		System.out.println("Cloned Musterinin Adresi: "+ System.identityHashCode(clonedMusteri));

		System.out.println();
		System.out.println("Clonelanan Müþterinin yaþ deðerini deðiþtirirsek orijinal müþterinin deðeri deðiþmez, çünkü burada DeepCopy Cloning uygulandi!!");
		clonedMusteri.setAge(36);
		orijinalMusteri.showUp();
		clonedMusteri.showUp();

		System.out.println("***********Deep Cloninig 2.metodu ile test etmek***********");


		System.out.println("\n****Sisteme Yeni Yöneticileri Eklenecek !!****");
		Yonetici orijinalYonetici = new Yonetici();
		Yonetici clonedYonetici = (Yonetici)kullaniciMaker.getDeepCloneMethod_2(orijinalYonetici);

		orijinalYonetici.showUp();
		clonedYonetici.showUp();
		System.out.println();

		System.out.println("orijinal Yoneticinin Adresi: "+ System.identityHashCode(orijinalYonetici));
		System.out.println("Cloned Yoneticinin Adresi: "+ System.identityHashCode(clonedYonetici));

		System.out.println();
		System.out.println("Clonelanan Yöneticinin yaþ deðerini deðiþtirirsek orijinal yöneticinin deðeri deðiþmez, çünkü burada DeepCopy Cloning 2.metod uygulandi!!");
		clonedYonetici.setAge(65);
		orijinalYonetici.showUp();
		clonedYonetici.showUp();
	}

}
