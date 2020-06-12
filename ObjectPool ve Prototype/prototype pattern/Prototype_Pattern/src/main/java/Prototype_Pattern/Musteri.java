/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototype_Pattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class Musteri extends Kullanici{
	private static final long serialVersionUID = 440347043243434494L;
	Random rand = new Random();

	public Musteri(){
		setKullanici_turu("M��teri");
		int value = rand.nextInt(51)+20;
		setAge(value);
		System.out.println("Bankan�n Orijinal(Asil) M��terisi Olu�turuldu !!");
	}

	@Override
	public Musteri makeShallowCopy(Kullanici orijinalMusteri) {
		System.out.println("Bankan�n Clonelanan(SallowCopy) M��terisi Olu�turuldu !!");

		Musteri clonedMusteri = new Musteri();
		clonedMusteri=(Musteri)orijinalMusteri;
		return clonedMusteri;
	}

	@Override
	public Musteri makeDeepCopyMethod_2() {
		System.out.println("Bankan�n Clonelanan(DeepCopy Method_2) M��terisi Olu�turuldu !!");

		Musteri clonedMusteri = null;
		try {
			clonedMusteri = (Musteri) super.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clonedMusteri;
	}

	@Override
	public Musteri makeDeepCopy() throws ClassNotFoundException {
		System.out.println("Bankan�n Clonelanan(DeepCopy) M��terisi Olu�turuldu !!");
		try {
			//Serialization of object
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bos);
			out.writeObject(this);
		      //De-serialization of object
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
	        ObjectInputStream in = new ObjectInputStream(bis);
	        Musteri clonedMusteri = (Musteri) in.readObject();
	        return clonedMusteri;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}


}