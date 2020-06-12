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
		setKullanici_turu("Müþteri");
		int value = rand.nextInt(51)+20;
		setAge(value);
		System.out.println("Bankanýn Orijinal(Asil) Müþterisi Oluþturuldu !!");
	}

	@Override
	public Musteri makeShallowCopy(Kullanici orijinalMusteri) {
		System.out.println("Bankanýn Clonelanan(SallowCopy) Müþterisi Oluþturuldu !!");

		Musteri clonedMusteri = new Musteri();
		clonedMusteri=(Musteri)orijinalMusteri;
		return clonedMusteri;
	}

	@Override
	public Musteri makeDeepCopyMethod_2() {
		System.out.println("Bankanýn Clonelanan(DeepCopy Method_2) Müþterisi Oluþturuldu !!");

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
		System.out.println("Bankanýn Clonelanan(DeepCopy) Müþterisi Oluþturuldu !!");
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