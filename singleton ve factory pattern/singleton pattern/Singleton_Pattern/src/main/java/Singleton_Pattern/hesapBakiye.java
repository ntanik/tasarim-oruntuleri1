/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Singleton_Pattern;

public class hesapBakiye {

	private static hesapBakiye hesapBakiye_sample;
	private double h_Bakiye;

	protected hesapBakiye(){
		// Default Constructor
	}

	public static hesapBakiye CreateObject(){
		if (hesapBakiye_sample == null){

			hesapBakiye_sample = new hesapBakiye();
		}
		return hesapBakiye_sample;
	}

	public void setBakiye(double value){
		h_Bakiye = value;
	}
	public double getBakiye(){
		return h_Bakiye;
	}

	public boolean ParaCek(double cekilenPara){
		if(cekilenPara <= h_Bakiye){
			h_Bakiye = h_Bakiye-cekilenPara;
			return true;
		}else {
			return false;
		}
	}
	public boolean ParaYatir(double yatirilanPara){
		try{
			h_Bakiye = h_Bakiye + yatirilanPara;
			return true;
		}catch (ArithmeticException e){
			return false;
		}

	}

}

