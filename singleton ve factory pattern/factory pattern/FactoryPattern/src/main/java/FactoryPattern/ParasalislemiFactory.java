/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryPattern;

/**
 *
 * @author User
 */
public class ParasalislemiFactory {
    
public static Parasalislemi CreateIslem(String instanceName){
		if (instanceName.equals("borc")){
			return new BorcKrediOdeme();
		}
		else if (instanceName.equals("transfer")){
			return new Transferislemi();
		}
		else if (instanceName.equals("yatirim")){
			return new Yatirmaislemi();
		}else
			return null;
	}
}
