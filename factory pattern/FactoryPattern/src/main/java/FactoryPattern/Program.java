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
public class Program {

	public static void main(String[] args) {
		System.out.println("### Factory Design Pattern's Example is Runing ###\n");

		Parasalislemi islem = ParasalislemiFactory.CreateIslem("transfer");
		islem.islemTuru();

		System.out.print("\n");

	    islem = ParasalislemiFactory.CreateIslem("borc");
	    islem.islemTuru();
	}
}
