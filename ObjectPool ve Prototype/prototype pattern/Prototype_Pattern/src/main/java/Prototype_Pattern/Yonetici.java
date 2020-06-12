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

public class Yonetici extends Kullanici{
	private static final long serialVersionUID = -6493171299609719559L;
	Random rand = new Random();

	public Yonetici(){
		setKullanici_turu("Yönetici");
		int value = rand.nextInt(51)+20;
		setAge(value);

		System.out.println("Bankanýn Orijinal(Asil) Yöneticisi Oluþturuldu !!");
	}
	@Override
	public Yonetici makeShallowCopy(Kullanici orijinalYonetici) {

		try {
			return (Yonetici)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Yonetici makeDeepCopyMethod_2(){

		System.out.println("Bankanýn Clonelanan(DeepCopy Method_2) Yöneticisi Oluþturuldu !!");

		Yonetici clonedYonetici = null;
		try {
			clonedYonetici = (Yonetici) super.clone();

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clonedYonetici;
	}

	@Override
	public Yonetici makeDeepCopy() throws ClassNotFoundException {
		System.out.println("Bankanýn Clonelanan(DeepCopy) Yöneticisi Oluþturuldu !!");
		try {
			//Serialization of object
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bos);
			out.writeObject(this);
		      //De-serialization of object
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
	        ObjectInputStream in = new ObjectInputStream(bis);
	        Yonetici clonedYonetici = (Yonetici) in.readObject();
	        return clonedYonetici;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
