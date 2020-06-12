/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iterator_Pattern_Example;

public class Yonetici extends Kullanici {

	public Yonetici(String yonetici_adi, String yonetici_soyadi,int age){
		setKullanici_adi(yonetici_adi);
		setKullanici_soyadi(yonetici_soyadi);
		setAge(age);
		setKullanici_turu("Yönetici");
	}
	public String toString() {
		return "yönetici_adi=" + getKullanici_adi() + ", yönetici_soyadi=" + getKullanici_soyadi() + ", age=" + getAge()
				+ ", kullanici_turu=" + getKullanici_turu() ;
	}
}
