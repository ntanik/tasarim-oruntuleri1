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
public class CloneFactory {
    
  public Kullanici getShallowClone(Kullanici kullaniciSample){
		return kullaniciSample.makeShallowCopy(kullaniciSample);
	}

	public Kullanici getDeepClone(Kullanici kullaniciSample) throws ClassNotFoundException{
		return kullaniciSample.makeDeepCopy();
	}

	public Kullanici getDeepCloneMethod_2(Kullanici kullaniciSample) {
		return kullaniciSample.makeDeepCopyMethod_2();
	}

}
