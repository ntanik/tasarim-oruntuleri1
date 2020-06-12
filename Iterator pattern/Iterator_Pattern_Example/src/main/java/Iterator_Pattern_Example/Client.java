/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Iterator_Pattern_Example;

/**
 *
 * @author User
 */
public class Client {
public static void main(String[] args){

		System.out.println("### Iterator Design Pattern's Example is Runing ###\n");

		System.out.println("--> Iterator Vas�tas� �le Sistemin M��terilerin Bilgileri Geri D�nd�rmek!!\n");
		Container iContainer = new MusteriContainer();
		Iterator iIterator = iContainer.createIterator();
		while(iIterator.hasNext()){
			Object object = iIterator.next();
			System.out.println(object);
		}
		System.out.println();
		System.out.println("--> Iterator Vas�tas� �le Sistemin Y�neticilerin Bilgileri Geri D�nd�rmek!!\n");
		Container yoneticiContainer = new YoneticiContainer();
		Iterator yoneticiIterator = yoneticiContainer.createIterator();
		while(yoneticiIterator.hasNext()){
			Object yoneticiObj=yoneticiIterator.next();
			System.out.println(yoneticiObj);
		}
	}
}
