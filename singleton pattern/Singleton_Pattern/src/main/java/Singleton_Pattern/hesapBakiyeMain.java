/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 
    package Singleton_Pattern;
import java.util.Scanner;
public class hesapBakiyeMain {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		hesapBakiye obj1 = hesapBakiye.CreateObject();
		hesapBakiye obj2 = hesapBakiye.CreateObject();
		hesapBakiye obj3 = hesapBakiye.CreateObject();

		obj1.setBakiye(2000);

		System.out.println("### Singleton Design Pattern's Example is Runing ###\n");

		System.out.printf("obj1-Bakiye : %.2f \n", obj1.getBakiye());
		System.out.printf("obj2-Bakiye : %.2f \n", obj2.getBakiye());
		System.out.printf("obj3-Bakiye : %.2f \n\n", obj3.getBakiye());

		obj2.setBakiye(3000);

		System.out.printf("obj1-Bakiye : %.2f \n", obj1.getBakiye());
		System.out.printf("obj2-Bakiye : %.2f \n", obj2.getBakiye());
		System.out.printf("obj3-Bakiye : %.2f \n", obj3.getBakiye());

		System.out.println("\nYatýrýlacak Paranýn Tutarýný Giriniz Lütfen (Double Number) :");
		double yatirilanPara = scanner.nextDouble();

		if(obj2.ParaYatir(yatirilanPara)){
			System.out.printf("%.2f TL Hesabýnýza Baþarýyle Yatýrýldý !!",yatirilanPara);

			System.out.printf("\nobj1-Bakiye : %.2f \n", obj1.getBakiye());
			System.out.printf("obj2-Bakiye : %.2f \n", obj2.getBakiye());
			System.out.printf("obj3-Bakiye : %.2f \n", obj3.getBakiye());
		}else{
			System.out.println("Lütfen istenilen kriterlere uygun bir sayý giriniz !!");
		}


	}

}



