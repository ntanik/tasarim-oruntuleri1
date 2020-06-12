/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Observer_Pattern;

public class Kampanya {
	String kampanyaBaslik;
	String kampanyaSuresi;
	String kampanyaIcerik;
	public Kampanya(){
	}
	public Kampanya(String kampanyaBaslik,String kampanyaIcerik, String kampanyaSuresi){
		this.kampanyaBaslik=kampanyaBaslik;
		this.kampanyaSuresi=kampanyaSuresi;
		this.kampanyaIcerik=kampanyaIcerik;
	}
	public String getKampanyaIcerik(){
		return this.kampanyaIcerik;
	}
}
