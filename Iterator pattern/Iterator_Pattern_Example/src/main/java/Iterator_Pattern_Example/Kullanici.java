/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iterator_Pattern_Example;

public abstract class Kullanici {

	private String musteri_adi;
	private String musteri_soyadi;
	private int age;
	private String kullanici_turu;

	public String getKullanici_adi() {
		return musteri_adi;
	}

	public void setKullanici_adi(String musteri_adi) {
		this.musteri_adi = musteri_adi;
	}

	public String getKullanici_soyadi() {
		return musteri_soyadi;
	}

	public void setKullanici_soyadi(String musteri_soyadi) {
		this.musteri_soyadi = musteri_soyadi;
	}
	public String getKullanici_turu(){
		return this.kullanici_turu;
	}

	public void setKullanici_turu(String kullanici_turu){
		this.kullanici_turu = kullanici_turu;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}
	@Override
	public String toString() {
		return "musteri_adi=" + musteri_adi + ", musteri_soyadi=" + musteri_soyadi + ", age=" + age
				+ ", kullanici_turu=" + kullanici_turu ;
	}

}