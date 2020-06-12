/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Prototype_Pattern;

import java.io.Serializable;

public abstract class Kullanici implements Serializable,Cloneable {
	private static final long serialVersionUID = -1937047519230746677L;
	public String kullanici_turu;
	public int age;

	public void setKullanici_turu(String kullanici_turu){
		this.kullanici_turu = kullanici_turu;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getKullanici_turu(){
		return this.kullanici_turu;
	}
	public int getAge(){
		return this.age;
	}


	public void showUp(){
		System.out.printf("Kullanýcý türü :[%s], Kullanýcý Yaþý:[%d]\n", getKullanici_turu(),getAge());
	}
	public abstract Kullanici makeShallowCopy(Kullanici orijinalKullanici);
	public abstract Kullanici makeDeepCopy() throws ClassNotFoundException;
	public abstract Kullanici makeDeepCopyMethod_2();

}